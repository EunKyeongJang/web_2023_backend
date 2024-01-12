package day09;

import java.util.Scanner;

public class BankApplication {//class start
    public static void main(String[] args) {//main start

        Account[] accArray=new Account[100];
        Scanner scanner=new Scanner(System.in);

        while(true) {//while start
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");

            //실행 선택
            System.out.print("선택> ");
            int sNum = scanner.nextInt();
            scanner.nextLine();

            if(sNum==1){//계좌 생성
                System.out.println("------------");
                System.out.println("계좌생성");
                System.out.println("------------");

                //계좌 정보 입력
                System.out.print("계좌번호 : ");
                    String accNum=scanner.nextLine();
                System.out.print("계좌주 : ");
                    String accUser=scanner.nextLine();
                System.out.print("초기입금액 : ");
                    int accCount=scanner.nextInt();

                Account account=new Account(accNum, accUser, accCount);
                for(int i=0; i<accArray.length; i++){

                }

                System.out.println("결과 : 계좌가 생성되었습니다.");
            }
            else if(sNum==2){//계좌 목록
                System.out.println("------------");
                System.out.println("계좌목록");
                System.out.println("------------");


            }
            else if(sNum==3){//예금
                System.out.println("------------");
                System.out.println("예금");
                System.out.println("------------");

            }
            else if(sNum==4){//출금
                System.out.println("------------");
                System.out.println("출금");
                System.out.println("------------");

            }
            else if(sNum==5){//종료
                System.out.println("프로그램 종료");
                break;
            }
            else{

            }
        }//while end


    }//main end
}//class end
