package kwshe;

import java.io.*;
import java.sql.Time;

import static java.lang.Thread.sleep;

public class FileAdd {
    public FileAdd() {
        File file=new File("D:\\zjs");
        System.out.println("���ڼ���ļ���");
        if(!file.exists()){//����ļ��в�����
            System.out.println("�ļ��в����ڣ����ڴ����ļ���......");
            file.mkdir();//�����ļ���
            System.out.println("�ļ��д�����ϣ���ʼ�����ļ�......");
        }
        else{
            System.out.println("�ļ��д��ڣ����ڼ���ļ��Ƿ�����......");
        }
        System.out.println("����ļ�order.txt......");
        File txt3 =new File("D:\\zjs\\order.txt");
        if(!txt3.exists()){//����ļ�������
            System.out.println("�ļ������ڣ���ʼ�����ļ�......");

            try{
                BufferedWriter bw3=new BufferedWriter(new FileWriter("D:\\zjs\\order.txt"));
                System.out.println("����д����Ϣ......");
                bw3.write("20210616103122\tM001\t2\t����\t12111116666\t������԰\t2021-06-1610:31:22\t������\n" +
                        "20210616103216\tM003\t1\t����\t12233676001\t����̶\t                2021-06-1610:32:16\t������\n" +
                        "20210616103539\tM004\t1\t����\t13345676655\t������\t                20210-06-1610:35:39\t�ѽ���\n" +
                        "20210617083430\tM002\t3\t�ܶ�\t13545645678\t���ֹ�ʦ\t2021-06-1708:34:30\t������\n" +
                        "20210617152020\tM001\t1\t����\t13834445556\tɰ֮��\t                2021-06-1715:20:20\t�ѽ���\n");
                bw3.close(); //���ǲ�������
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("�����ļ�order.txtʧ�ܣ�����");
            }
        }
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("����ļ�meal.txt......");
        File txt4 =new File("D:\\zjs\\meal.txt");
        if(!txt4.exists()){//����ļ�������
            System.out.println("�ļ������ڣ���ʼ�����ļ�......");
            try{
                BufferedWriter bw4=new BufferedWriter(new FileWriter("D:\\zjs\\meal.txt"));
                System.out.println("����д����Ϣ......");
                bw4.write("M005\t�ɹ�����\t�ɹ�����+�ϲ˵�����+�׷�\t20\t1\n" +
                        "M004\t����˿��\t����˿��+�ϲ˵�����+�׷�\t20\t1\n" +
                        "M003\t���մ���\t���մ���+�ϲ˵�����+�׷�\t30\t0\n" +
                        "M002\t������˿\t������˿+�ϲ˵�����+�׷�\t25\t1\n" +
                        "M001\t��������\t��������+�ϲ˵�����+�׷�\t25\t1\n");
                bw4.close();
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("�����ļ�meal.txtʧ�ܣ�����");
            }
        }
        System.out.println("�ļ���Ϣ������ϣ���ӭʹ��......");
        System.out.println("----------------------------------------");
    }
}
