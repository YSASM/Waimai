package kwshe;

import java.io.*;
import java.util.Scanner;

public class Delmeal {
    Scanner sc = new Scanner(System.in);
    Pause pause = new Pause();
    public Delmeal() {
        String n = catchstr2();
        if(n.equals("")){
            System.out.println("您还没有套餐！");
            pause.pause();
            new Taocan();
        }
        String Count[] = n.split("[\\s]*\\n");
        System.out.println("请输入要删除套餐的序号：");
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
            BufferedWriter bw3=new BufferedWriter(new FileWriter("D:\\zjs\\meal.txt"));
            System.out.println("正在写入信息......");
            bw3.write(str2);
            bw3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new  Taocan();
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
}
