package kwshe;

import java.io.*;
import java.util.Scanner;

public class Delmeal {
    Scanner sc = new Scanner(System.in);
    Pause pause = new Pause();
    public Delmeal() {
        String n = catchstr2();
        if(n.equals("")){
            System.out.println("����û���ײͣ�");
            pause.pause();
            new Taocan();
        }
        String Count[] = n.split("[\\s]*\\n");
        System.out.println("������Ҫɾ���ײ͵���ţ�");
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
            System.out.println("����д����Ϣ......");
            bw3.write(str2);
            bw3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new  Taocan();
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
}
