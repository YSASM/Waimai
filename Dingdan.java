package kwshe;

import java.util.Scanner;

public class Dingdan {
    Scanner sc = new Scanner(System.in);
    public Dingdan() {
        System.out.println("1.接收订单");
        System.out.println("2.查询订单");
        System.out.println("3.显示订单");
        System.out.println("4.派送订单");
        System.out.println("5.删除订单");
        System.out.println("6.返回");
        System.out.println("7.下班");
        System.out.println("----------------------------------------");
        chek();
    }
    void chek(){
        JieShoudd js = new JieShoudd();
        String n=sc.next();
        if(n.equals("1")){
            js.add();
        }
        else if(n.equals("2")){
            js.chaxun();
        }
        else if(n.equals("3")){
            js.show();
        }
        else if(n.equals("4")){
            js.paisong();
        }
        else if(n.equals("5")){
            js.del();
        }
        else if(n.equals("6")){
            new Home();
        }
        else if(n.equals("7")){
            System.exit(0);
        }
        else{
            System.out.println("错误，请重新输入：");
            chek();
        }
    }
}

