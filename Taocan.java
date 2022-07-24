package kwshe;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Taocan {
    Pause pause = new Pause();
    Scanner sc = new Scanner(System.in);
    public Taocan() {
        System.out.println("1.ÏÔÊ¾Ì×²Í");
        System.out.println("2.ÐÞ¸ÄÌ×²Í");
        System.out.println("3.Ìí¼ÓÌ×²Í");
        System.out.println("4.É¾³ýÌ×²Í");
        System.out.println("5.·µ»Ø");
        System.out.println("6.ÏÂ°à");
        System.out.println("----------------------------------------");
        check();
    }
    void check(){
        String n = sc.next();
        if(n.equals("1")){
            show();
        }
        else if(n.equals("2")){
            new Getmeal();
        }
        else if(n.equals("3")){
            new Addmeal();
        }
        else if(n.equals("4")){
            new Delmeal();
        }
        else if(n.equals("5")){
            new Home();
        }
        else if(n.equals("6")){
            System.exit(0);
        }
        else{
            System.out.println("´íÎó£¬ÇëÖØÐÂÊäÈë£º");
            check();
        }
    }
    void show() {
        FileInputStream fis;
        try {
            File file = new File("D:\\zjs\\meal.txt");
            fis = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            while (fis.read(b) != -1) {
            }
            System.out.println(new String(b));
        } catch (Exception e) {
            e.printStackTrace();
        }
        pause.pause();
        new Taocan();
    }
}
