package kwshe;

import java.io.*;
import java.sql.Time;

import static java.lang.Thread.sleep;

public class FileAdd {
    public FileAdd() {
        File file=new File("D:\\zjs");
        System.out.println("正在检查文件夹");
        if(!file.exists()){//如果文件夹不存在
            System.out.println("文件夹不存在，正在创建文件夹......");
            file.mkdir();//创建文件夹
            System.out.println("文件夹创建完毕，开始创建文件......");
        }
        else{
            System.out.println("文件夹存在，正在检查文件是否完整......");
        }
        System.out.println("检查文件order.txt......");
        File txt3 =new File("D:\\zjs\\order.txt");
        if(!txt3.exists()){//如果文件不存在
            System.out.println("文件不存在，开始创建文件......");

            try{
                BufferedWriter bw3=new BufferedWriter(new FileWriter("D:\\zjs\\order.txt"));
                System.out.println("正在写入信息......");
                bw3.write("20210616103122\tM001\t2\t张娜\t12111116666\t凯旋花园\t2021-06-1610:31:22\t已派送\n" +
                        "20210616103216\tM003\t1\t李丽\t12233676001\t净月潭\t                2021-06-1610:32:16\t已派送\n" +
                        "20210616103539\tM004\t1\t张林\t13345676655\t宽城万达\t                20210-06-1610:35:39\t已接收\n" +
                        "20210617083430\tM002\t3\t周东\t13545645678\t吉林工师\t2021-06-1708:34:30\t已派送\n" +
                        "20210617152020\tM001\t1\t李丽\t13834445556\t砂之船\t                2021-06-1715:20:20\t已接收\n");
                bw3.close(); //这是测试用例
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("创建文件order.txt失败！！！");
            }
        }
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("检查文件meal.txt......");
        File txt4 =new File("D:\\zjs\\meal.txt");
        if(!txt4.exists()){//如果文件不存在
            System.out.println("文件不存在，开始创建文件......");
            try{
                BufferedWriter bw4=new BufferedWriter(new FileWriter("D:\\zjs\\meal.txt"));
                System.out.println("正在写入信息......");
                bw4.write("M005\t干锅豆腐\t干锅豆腐+紫菜蛋花汤+米饭\t20\t1\n" +
                        "M004\t清蒸丝瓜\t清蒸丝瓜+紫菜蛋花汤+米饭\t20\t1\n" +
                        "M003\t红烧带鱼\t红烧带鱼+紫菜蛋花汤+米饭\t30\t0\n" +
                        "M002\t鱼香肉丝\t鱼香肉丝+紫菜蛋花汤+米饭\t25\t1\n" +
                        "M001\t宫保鸡丁\t宫保鸡丁+紫菜蛋花汤+米饭\t25\t1\n");
                bw4.close();
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("创建文件meal.txt失败！！！");
            }
        }
        System.out.println("文件信息检索完毕，欢迎使用......");
        System.out.println("----------------------------------------");
    }
}
