package 팀과제2;

import java.util.Scanner;

public class 팀과제 {//class start
    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);

        Client client=new Client();

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
                scanner.nextLine();
                if(sType<=서비스형태배열.length) {
                    System.out.println("선택한 서비스 : "+서비스형태배열[sType-1].이름);
                    System.out.println("금액 : "+서비스형태배열[sType-1].금액);

                    //구독 동의여부 출력
                    System.out.println("구독하시겠습니까? (yes/no 로 답변 해 주십시오.)");
                    System.out.print("선택 > ");
                    String strcheckSub=scanner.nextLine();
                    System.out.println(strcheckSub);

                    if(strcheckSub.equals("yes")){//if start
                        client.서비스형태=서비스형태배열[sType-1].이름;
                        client.구독기간=1;
                    }
                    else if(strcheckSub.equals("no")){
                        continue;
                    }
                    else{
                        System.out.println("올바르지 않은 입력입니다.");
                    }//if end
                }
            }//if==1 end

            else if(sCategory==2){//2.사용현황 선택

                System.out.println(client.toString());

                for(int i=0; i<서비스형태배열.length; i++) {
                    if(client.서비스형태 == 서비스형태배열[i].이름){
                        System.out.println("용량="+서비스형태배열[i].용량);
                        System.out.println("사용인원="+서비스형태배열[i].사용인원);
                    }
                }

            }

        }//while end
    }//main end
}//class end
