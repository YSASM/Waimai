package kwshe;

import java.util.Scanner;

public class Home {
    Scanner sc = new Scanner(System.in);
    public Home(){
        System.out.println("1.订单管理");
        System.out.println("2.套餐管理");
        System.out.println("3.下班");
        System.out.println("----------------------------------------");
        chek();
    }
    void chek(){
        String n=sc.next();
        if(n.equals("1")){
            new Dingdan();
        }
        else if(n.equals("2")){
            new Taocan();
        }
        else if(n.equals("3")){
            System.exit(0);
        }
        else{
            System.out.println("错误，请重新输入：");
            chek();
        }
    }
}
