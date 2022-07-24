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
        System.out.println("请输入编号：");
        hm = sc.next();
        System.out.println("请输入套餐名：");
        name = sc.next();
        System.out.println("请输入描述：");
        nr = sc.next();
        System.out.println("请输入价格：");
        jg = sc.next();
        System.out.println("请输入状态(1或0)：");
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
        System.out.println("写入成功！");
    }
}
