package kwshe;

import java.util.Scanner;

public class Start {
    Scanner sc = new Scanner(System.in);
    public Start() {
        System.out.println("欢迎使用“宅急送”订单管理系统");
        System.out.println("1.开始上班");
        System.out.println("2.下班");
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
            System.out.println("错误，请重新输入：");
            chek();
        }
    }
}

