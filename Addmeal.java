package kwshe;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Addmeal {
    Scanner sc = new Scanner(System.in);
    public Addmeal() {
        String hm,name,nr,jg,zt;
        System.out.println("�������ţ�");
        hm = sc.next();
        System.out.println("�������ײ�����");
        name = sc.next();
        System.out.println("������������");
        nr = sc.next();
        System.out.println("������۸�");
        jg = sc.next();
        System.out.println("������״̬(1��0)��");
        zt = sc.next();
        writeToTXT(hm+"\t"+name+"\t"+nr+"\t"+jg+"\t"+zt+"\n");
        new Taocan();
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
