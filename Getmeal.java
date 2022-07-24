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
            System.out.print((k+1)+"."+"编号："+hm[k]+"\t"+"套餐名："+name[k]+"\t"+"描述："+nr[k]+"\t"+"价格："+jg[k]+"\t");
            if(zt[k].equals("1")){
                System.out.println("状态：可选");
            }
            else if(zt[k].equals("0")){
                System.out.println("状态：不可选");
            }
        }
        System.out.println("请输入要修改的套餐序号：");
        int x = sc.nextInt();
        int y = x-1;
        System.out.println("请选择要修改的内容：");
        System.out.println("1.编号");
        System.out.println("2.套餐名");
        System.out.println("3.描述");
        System.out.println("4.价格");
        System.out.println("5.状态");
        int z = sc.nextInt();
        switch (z){
            case 1:System.out.println("请输入修改后编号：");
            hm[y] = sc.next();break;
            case 2:System.out.println("请输入修改后套餐名：");
            name[y] = sc.next();break;
            case 3:System.out.println("请输入修改后描述：");
            nr[y] = sc.next();break;
            case 4:System.out.println("请输入修改后价格：");
            jg[y] = sc.next();break;
            case 5:System.out.println("请输入修改后状态(1为可选0为不可选)：");
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
        new Taocan();
    }
    String catchstr() {
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
        System.out.println("写入成功！");
    }
}
