package kwshe;

import java.util.Scanner;

public class Start {
    Scanner sc = new Scanner(System.in);
    public Start() {
        System.out.println("��ӭʹ�á�լ���͡���������ϵͳ");
        System.out.println("1.��ʼ�ϰ�");
        System.out.println("2.�°�");
        System.out.println("----------------------------------------");
        chek();
    }
    void chek(){
        String n = sc.next();
        if(n.equals("1")){
            new FileAdd();
            new Home();
        }
        else if(n.equals("2")){
            System.exit(0);
        }
        else{
            System.out.println("�������������룺");
            chek();
        }
    }
}

