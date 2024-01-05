package day04;

import java.util.Scanner;

//p.138~139
public class Step4 {//class start

    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);
        int money=0;
        while(true){//while start
            System.out.println("-----------------------------");
            System.out.println("1.예금 2.출금 3.잔고, 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택>");
            
            int ch= scanner.nextInt();

            if(ch==1){
                System.out.print("예금액>");
                int inMoney=scanner.nextInt();//얼마나 예금할건지
                money+=inMoney;
            }
            if(ch==2){
                System.out.print("출금액>");
                int outMoney=scanner.nextInt();//얼마나 출금할건지
                money-=outMoney;
            }
            if(ch==3){
                System.out.print("잔고>8000");
            }
            if(ch==4){
                System.out.print("프로그램 종료");
            }
        }//while end
    }//main end
}//class end
/*//예시

    은행 프로그램 구현
    [요구사항 설계]
    1.반복적으로 기능 사용 [단 종료기능 선택시 종료]
    2. 기능 : 예금, 출금, 잔고, 종료
        예금 : 더하기 작업
            금액에서 예금액을 입력받아 금액에 더한다.
        출금 : 빼기 작업
            금액에서 출금액을 입력받아 금액에서 빼기한다.
        잔고 : 확인작업
            금액의 값을 출력한다.
        종료 : 푸로그램을 끝내는 작엄
            무한루프를 탈출한다. 1.스위치변수 2.break 3.return
            - 상황에 따라 선택
    3. 데이터 설계
        금액 : 예금, 출금했을때 누적으로 저장. (전역)

 */

