package kwshe;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JieShoudd {
    Pause pause = new Pause();
    Scanner sc = new Scanner(System.in);

    void paisong() {
        String[] hm = new String[1000];
        String[] bh = new String[1000];
        String[] sl = new String[1000];
        String[] name = new String[1000];
        String[] phone = new String[1000];
        String[] dz = new String[1000];
        String[] time = new String[1000];
        String[] zt = new String[1000];
        String n = catchstr();
        String[] Count = n.split("[\\s]*[\\t\\n]");
        int i = 0, j = 0;
        while (i != Count.length) {
            hm[j] = Count[i];
            i++;
            bh[j] = Count[i];
            i++;
            sl[j] = Count[i];
            i++;
            name[j] = Count[i];
            i++;
            phone[j] = Count[i];
            i++;
            dz[j] = Count[i];
            i++;
            time[j] = Count[i];
            i++;
            zt[j] = Count[i];
            i++;
            j++;
        }
        int[] save = new int[1000];
        int x = 0;
        for (int k = 0; k < j; k++) {
            if (zt[k].equals("�ѽ���")) {
                save[x] = k;
                x++;
                System.out.println(x + "." + hm[k] + "\t" + bh[k] + "\t" + sl[k] + "\t" + name[k] + "\t" + phone[k] + "\t" + dz[k] + "\t" + time[k] + "\t" + zt[k]);
            }
        }
        if(x==0){
            System.out.println("û�ж�����Ҫ���ͣ�");
            pause.pause();
            new Dingdan();
        }
        System.out.println("������Ҫ���͵Ķ�����ţ�");
        int y = sc.nextInt();
        int z = save[y - 1];
        zt[z] = "������";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time[z] = df.format(new Date());
        for (int k = 0; k < j; k++) {
            System.out.println(hm[k] + "\t" + bh[k] + "\t" + sl[k] + "\t" + name[k] + "\t" + phone[k] + "\t" + dz[k] + "\t" + time[k] + "\t" + zt[k]);
        }
        String[] str = new String[1000];
        String str2 = "";
        for (int k = 0; k < j; k++) {
            str[k] = hm[k] + "\t" + bh[k] + "\t" + sl[k] + "\t" + name[k] + "\t" + phone[k] + "\t" + dz[k] + "\t" + time[k] + "\t" + zt[k] + "\n";
        }
        for (int k = 0; k < j; k++) {
            str2 = str2 + str[k];
        }
        try {
            BufferedWriter bw3 = new BufferedWriter(new FileWriter("D:\\zjs\\order.txt"));
            System.out.println("����д����Ϣ......");
            for (int k = 0; k < j; k++) {
                bw3.write("");
            }
            bw3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeToTXT(str2);
        pause.pause();
        new Dingdan();
    }

    void add() {
        String bh, dz, name, phone, sl;
        System.out.println("�������ײͱ��(�磺M001)��");
        bh = Getmeal();
        System.out.println("�������ײ�������");
        sl = sc.next();
        System.out.println("�����붩����������");
        name = sc.next();
        System.out.println("�����붩���˵绰��");
        phone = sc.next();
        System.out.println("���͵�ַ��");
        dz = sc.next();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmss");//�������ڸ�ʽ
        System.out.println("����д����Ϣ......");
        writeToTXT(df2.format(new Date()) + "\t" + bh + "\t" + sl + "\t" + name + "\t" + phone + "\t" + dz + "\t" + df.format(new Date()) + "\t�ѽ���\n");
        new Dingdan();
    }

    void chaxun() {
        String[] hm = new String[1000];
        String[] bh = new String[1000];
        String[] sl = new String[1000];
        String[] name = new String[1000];
        String[] phone = new String[1000];
        String[] dz = new String[1000];
        String[] time = new String[1000];
        String[] zt = new String[1000];
        String n = catchstr();
        String Count[] = n.split("[\\s]*[\\t\\n]");
        int i = 0, j = 0;
        while (i != Count.length) {
            hm[j] = Count[i];
            i++;
            bh[j] = Count[i];
            i++;
            sl[j] = Count[i];
            i++;
            name[j] = Count[i];
            i++;
            phone[j] = Count[i];
            i++;
            dz[j] = Count[i];
            i++;
            time[j] = Count[i];
            i++;
            zt[j] = Count[i];
            i++;
            j++;
        }
        System.out.println("ͨ��ʲô��ѯ��");
        System.out.println("1.����");
        System.out.println("2.�绰");
        System.out.println("3.������");
        System.out.println("4.��ַ");
        System.out.println("5.����");
        chek2(hm, bh, sl, name, phone, dz, time, zt, j);
    }

    void chek2(String[] hm,
               String[] bh,
               String[] sl,
               String[] name,
               String[] phone,
               String[] dz,
               String[] time,
               String[] zt,
               int j) {
        Pause pause = new Pause();
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("������������");
            String m = sc.next();
            for (int i = 0; i < j; i++) {
                if (m.equals(name[i])) {
                    System.out.println(hm[i] + "\t" + bh[i] + "\t" + sl[i] + "\t" + name[i] + "\t" + phone[i] + "\t" + dz[i] + "\t" + time[i] + "\t" + zt[i]);
                }
            }
            pause.pause();
            new Dingdan();
        } else if (n == 2) {
            System.out.println("������绰��");
            String m = sc.next();
            for (int i = 0; i < j; i++) {
                if (m.equals(phone[i])) {
                    System.out.println(hm[i] + "\t" + bh[i] + "\t" + sl[i] + "\t" + name[i] + "\t" + phone[i] + "\t" + dz[i] + "\t" + time[i] + "\t" + zt[i]);
                }
            }
            pause.pause();
            new Dingdan();
        } else if (n == 3) {
            System.out.println("�����붩���ţ�");
            String m = sc.next();
            for (int i = 0; i < j; i++) {
                if (m.equals(hm[i])) {
                    System.out.println(hm[i] + "\t" + bh[i] + "\t" + sl[i] + "\t" + name[i] + "\t" + phone[i] + "\t" + dz[i] + "\t" + time[i] + "\t" + zt[i]);
                }
            }
            pause.pause();
            new Dingdan();
        } else if (n == 4) {
            System.out.println("�������ַ��");
            String m = sc.next();
            for (int i = 0; i < j; i++) {
                if (m.equals(dz[i])) {
                    System.out.println(hm[i] + "\t" + bh[i] + "\t" + sl[i] + "\t" + name[i] + "\t" + phone[i] + "\t" + dz[i] + "\t" + time[i] + "\t" + zt[i]);
                }
            }
            pause.pause();
            new Dingdan();
        } else if (n == 5) {
            new Dingdan();
        } else {
            System.out.println("�������������룺");
            chek2(hm, bh, sl, name, phone, dz, time, zt, j);
        }
    }

    String catchstr() {
        File file = new File("D:\\zjs\\order.txt");
        FileInputStream fis = null; //�����ļ�������
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buffer = new byte[1024]; //�����ļ����뻺����
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //�����ڴ������
        int len = 0;
        while (true) {
            try {
                if (!((len = fis.read(buffer)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            } //������ѭ���������ļ��е����ݾ�ȫ��д���˻�����
            bos.write(buffer, 0, len);
        }
        byte[] result = bos.toByteArray(); //ͨ���ڴ�������Ѷ��������ݷŽ��ֽ�����
        String content = new String(result); //ͨ���ַ��͵����ݴ�Ž����Ҳ�Ͱ��ļ��е����ݸ�ֵ����content����
        return content;
    }

    void show() {
        FileInputStream fis;
        try {
            File file = new File("D:\\zjs\\order.txt");
            fis = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            while (fis.read(b) != -1) {
            }
            System.out.println(new String(b));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pause.pause();
        new Dingdan();
    }

    void writeToTXT(String str) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("D:\\zjs\\order.txt", true)));
            out.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("д��ɹ���");
    }
    String Getmeal() {
        String[] hm = new String[100];
        String[] name = new String[100];
        String[] nr = new String[100];
        String[] jg = new String[100];
        String[] zt = new String[100];
        String n = catchstr2();
        String Count[] = n.split("[\\s]*[\\t\\n]");
        int i = 0, j = 0;
        while (i != Count.length) {
            hm[j] = Count[i];
            i++;
            name[j] = Count[i];
            i++;
            nr[j] = Count[i];
            i++;
            jg[j] = Count[i];
            i++;
            zt[j] = Count[i];
            i++;
            j++;
        }System.out.println("��ѡ�ײͣ�");
        String[] hm2 = new String[1000];
        int o=0;
        for (int k=0;k<j;k++){
            if (zt[k].equals("1")) {
                hm2[o]=hm[k];
                o++;
                System.out.println((k+1)+"."+"��ţ�"+hm[k]+"\t"+"�ײ�����"+name[k]+"\t"+"������"+nr[k]+"\t"+"�۸�"+jg[k]+"\t");
            }
        }
        int count=0,k=0;
        while (true){
            String h = sc.next();
            count = 0;
            for (k = 0; k < j; k++) {
                if (!h.equals(hm2[k])) {
                    count++;
                }
            }
            if(count==k){
                System.out.println("��������ȷ�ı�ţ�");
            }
            else{
                return h;
            }
        }
    }
    String catchstr2() {
        File file = new File("D:\\zjs\\meal.txt");
        FileInputStream fis = null; //�����ļ�������
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buffer = new byte[1024]; //�����ļ����뻺����
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //�����ڴ������
        int len = 0;
        while (true) {
            try {
                if (!((len = fis.read(buffer)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            } //������ѭ���������ļ��е����ݾ�ȫ��д���˻�����
            bos.write(buffer, 0, len);
        }
        byte[] result = bos.toByteArray(); //ͨ���ڴ�������Ѷ��������ݷŽ��ֽ�����
        String content = new String(result); //ͨ���ַ��͵����ݴ�Ž����Ҳ�Ͱ��ļ��е����ݸ�ֵ����content����
        return content;
    }
    void del(){
        String n = catchstr();
        if(n.equals("")){
            System.out.println("����û�ж�����");
            pause.pause();
            new Dingdan();
        }
        String Count[] = n.split("[\\s]*\\n");
        System.out.println("������Ҫɾ����������ţ�");
        int len = Count.length;
        for(int i=0;i<len;i++){
            System.out.println((i+1)+"."+Count[i]);
        }
        int num = sc.nextInt()-1;
        for (int i=num;i<len-1;i++){
            Count[i]=Count[i+1];
        }
        Count[len-1]=null;
        String str2="";
        for(int i=0;i<len-1;i++){
            str2 = str2+Count[i]+"\n";
        }
        System.out.println(str2);
        try {
            BufferedWriter bw3=new BufferedWriter(new FileWriter("D:\\zjs\\order.txt"));
            System.out.println("����д����Ϣ......");
            bw3.write(str2);
            bw3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new  Dingdan();
    }
}
