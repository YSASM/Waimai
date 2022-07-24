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
            if (zt[k].equals("已接收")) {
                save[x] = k;
                x++;
                System.out.println(x + "." + hm[k] + "\t" + bh[k] + "\t" + sl[k] + "\t" + name[k] + "\t" + phone[k] + "\t" + dz[k] + "\t" + time[k] + "\t" + zt[k]);
            }
        }
        if(x==0){
            System.out.println("没有订单需要派送！");
            pause.pause();
            new Dingdan();
        }
        System.out.println("请输入要派送的订单序号：");
        int y = sc.nextInt();
        int z = save[y - 1];
        zt[z] = "已派送";
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
            System.out.println("正在写入信息......");
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
        System.out.println("请输入套餐编号(如：M001)：");
        bh = Getmeal();
        System.out.println("请输入套餐数量：");
        sl = sc.next();
        System.out.println("请输入订餐人姓名：");
        name = sc.next();
        System.out.println("请输入订餐人电话：");
        phone = sc.next();
        System.out.println("派送地址：");
        dz = sc.next();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        System.out.println("正在写入信息......");
        writeToTXT(df2.format(new Date()) + "\t" + bh + "\t" + sl + "\t" + name + "\t" + phone + "\t" + dz + "\t" + df.format(new Date()) + "\t已接收\n");
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
        System.out.println("通过什么查询？");
        System.out.println("1.姓名");
        System.out.println("2.电话");
        System.out.println("3.订单号");
        System.out.println("4.地址");
        System.out.println("5.返回");
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
            System.out.println("请输入姓名：");
            String m = sc.next();
            for (int i = 0; i < j; i++) {
                if (m.equals(name[i])) {
                    System.out.println(hm[i] + "\t" + bh[i] + "\t" + sl[i] + "\t" + name[i] + "\t" + phone[i] + "\t" + dz[i] + "\t" + time[i] + "\t" + zt[i]);
                }
            }
            pause.pause();
            new Dingdan();
        } else if (n == 2) {
            System.out.println("请输入电话：");
            String m = sc.next();
            for (int i = 0; i < j; i++) {
                if (m.equals(phone[i])) {
                    System.out.println(hm[i] + "\t" + bh[i] + "\t" + sl[i] + "\t" + name[i] + "\t" + phone[i] + "\t" + dz[i] + "\t" + time[i] + "\t" + zt[i]);
                }
            }
            pause.pause();
            new Dingdan();
        } else if (n == 3) {
            System.out.println("请输入订单号：");
            String m = sc.next();
            for (int i = 0; i < j; i++) {
                if (m.equals(hm[i])) {
                    System.out.println(hm[i] + "\t" + bh[i] + "\t" + sl[i] + "\t" + name[i] + "\t" + phone[i] + "\t" + dz[i] + "\t" + time[i] + "\t" + zt[i]);
                }
            }
            pause.pause();
            new Dingdan();
        } else if (n == 4) {
            System.out.println("请输入地址：");
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
            System.out.println("错误，请重新输入：");
            chek2(hm, bh, sl, name, phone, dz, time, zt, j);
        }
    }

    String catchstr() {
        File file = new File("D:\\zjs\\order.txt");
        FileInputStream fis = null; //创建文件输入流
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buffer = new byte[1024]; //创建文件输入缓冲区
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //创建内存输出流
        int len = 0;
        while (true) {
            try {
                if (!((len = fis.read(buffer)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            } //当整个循环结束后，文件中的内容就全部写入了缓冲区
            bos.write(buffer, 0, len);
        }
        byte[] result = bos.toByteArray(); //通过内存输出流把读到的内容放进字节数组
        String content = new String(result); //通过字符型的数据存放结果，也就把文件中的内容赋值给了content变量
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
        System.out.println("写入成功！");
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
        }System.out.println("可选套餐：");
        String[] hm2 = new String[1000];
        int o=0;
        for (int k=0;k<j;k++){
            if (zt[k].equals("1")) {
                hm2[o]=hm[k];
                o++;
                System.out.println((k+1)+"."+"编号："+hm[k]+"\t"+"套餐名："+name[k]+"\t"+"描述："+nr[k]+"\t"+"价格："+jg[k]+"\t");
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
                System.out.println("请输入正确的编号：");
            }
            else{
                return h;
            }
        }
    }
    String catchstr2() {
        File file = new File("D:\\zjs\\meal.txt");
        FileInputStream fis = null; //创建文件输入流
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buffer = new byte[1024]; //创建文件输入缓冲区
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //创建内存输出流
        int len = 0;
        while (true) {
            try {
                if (!((len = fis.read(buffer)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            } //当整个循环结束后，文件中的内容就全部写入了缓冲区
            bos.write(buffer, 0, len);
        }
        byte[] result = bos.toByteArray(); //通过内存输出流把读到的内容放进字节数组
        String content = new String(result); //通过字符型的数据存放结果，也就把文件中的内容赋值给了content变量
        return content;
    }
    void del(){
        String n = catchstr();
        if(n.equals("")){
            System.out.println("您还没有订单！");
            pause.pause();
            new Dingdan();
        }
        String Count[] = n.split("[\\s]*\\n");
        System.out.println("请输入要删除订单的序号：");
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
            System.out.println("正在写入信息......");
            bw3.write(str2);
            bw3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new  Dingdan();
    }
}
