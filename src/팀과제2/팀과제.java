package 팀과제2;

import java.util.Scanner;

public class 팀과제 {//class start
    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);

        /*서비스형태[] 서비스형태배열 =new 서비스형태[3];

        서비스형태 basic=new 서비스형태("Basic", "1TB", "2명", 10000);
        서비스형태배열[0]=basic;
*/
        서비스형태 Basic = new 서비스형태("Basic","1TB","2",10000);
        서비스형태 Standard = new 서비스형태("Standard","2TB","2",11000);
        서비스형태 Premiunm = new 서비스형태("Premiunm","3TB","2",12000);

        서비스형태[] 서비스형태배열 = new 서비스형태[]{Basic,Standard,Premiunm};


        for(int i=0; i<서비스형태배열.length; i++){
            System.out.println(서비스형태배열[i].이름);
        }

        while(true){//while start
            System.out.println("1.구독신청 | 2.사용현황 | 3.기간연장 | 4.로그아웃");
            System.out.print("선택 > ");
            int sCategory=scanner.nextInt();

            if(sCategory==1){//1.구독신청 선택
                System.out.println("1.Basic | 2.Standard | 3.Premiun");
                System.out.print("선택 > ");
                int sType=scanner.nextInt();
                if(sType<=서비스형태배열.length) {
                    System.out.println("선택한 서비스 : "+서비스형태배열[sType-1].이름);
                    System.out.println("금액 : "+서비스형태배열[sType-1].금액);
                }

            }
        }//while end
    }//main end
}//class end
