package kwshe;

import java.io.*;
import java.util.Scanner;

public class Getmeal {
    Scanner sc = new Scanner(System.in);
    Pause pause = new Pause();
    public Getmeal() {
        String[] hm = new String[100];
        String[] name = new String[100];
        String[] nr = new String[100];
        String[] jg = new String[100];
        String[] zt = new String[100];
        String n = catchstr();
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
        }
        for (int k=0;k<j;k++){
            System.out.print((k+1)+"."+"��ţ�"+hm[k]+"\t"+"�ײ�����"+name[k]+"\t"+"������"+nr[k]+"\t"+"�۸�"+jg[k]+"\t");
            if(zt[k].equals("1")){
                System.out.println("״̬����ѡ");
            }
            else if(zt[k].equals("0")){
                System.out.println("״̬������ѡ");
            }
        }
        System.out.println("������Ҫ�޸ĵ��ײ���ţ�");
        int x = sc.nextInt();
        int y = x-1;
        System.out.println("��ѡ��Ҫ�޸ĵ����ݣ�");
        System.out.println("1.���");
        System.out.println("2.�ײ���");
        System.out.println("3.����");
        System.out.println("4.�۸�");
        System.out.println("5.״̬");
        int z = sc.nextInt();
        switch (z){
            case 1:System.out.println("�������޸ĺ��ţ�");
            hm[y] = sc.next();break;
            case 2:System.out.println("�������޸ĺ��ײ�����");
            name[y] = sc.next();break;
            case 3:System.out.println("�������޸ĺ�������");
            nr[y] = sc.next();break;
            case 4:System.out.println("�������޸ĺ�۸�");
            jg[y] = sc.next();break;
            case 5:System.out.println("�������޸ĺ�״̬(1Ϊ��ѡ0Ϊ����ѡ)��");
            zt[y] = sc.next();break;
        }
        String[] str = new String[1000];
        String str2 = "";
        for (int k = 0; k < j; k++) {
            str[k] = hm[k] + "\t" + name[k] + "\t" + nr[k] + "\t" + jg[k] + "\t" + zt[k] + "\n";
        }
        for (int k = 0; k < j; k++) {
            str2 = str2 + str[k];
        }
        try {
            BufferedWriter bw3 = new BufferedWriter(new FileWriter("D:\\zjs\\meal.txt"));
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
        new Taocan();
    }
    String catchstr() {
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
    void writeToTXT(String str) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("D:\\zjs\\meal.txt", true)));
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
}
