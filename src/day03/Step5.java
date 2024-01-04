package day03;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Step5 {//class start
    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);

//        문제1 : 점수를 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
        /*System.out.print("점수를 입력하세요 : ");
        float score1=scanner.nextFloat();
        
        if(score1>=90){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }*/


//        문제2 : 점수를 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
        /*System.out.print("점수를 입력하세요 : ");
        float score=scanner.nextFloat();
        
        if (score>=90){
            System.out.println("A등급");
        }
        else if(score>=80){
            System.out.println("B등급");
        }
        else if (score>=70){
            System.out.println("C등급");
        }
        else{
            System.out.println("재시험");
        }*/
        
//
//        문제3 : 임의의 정수 3개 를 입력받아서 오름차순 으로 3개의 변수를 출력하시오.
        /*System.out.print("정수1 : ");
        int i1=scanner.nextInt();
        System.out.print("정수2 : ");
        int i2=scanner.nextInt();
        System.out.print("정수3 : ");
        int i3=scanner.nextInt();

        int check=0;

        if(i1>i2){check=i1; i1=i2; i2=check;}
        if(i1>i3){check=i1; i1=i3; i3=check;}
        if(i2>i3){check=i2; i2=i3; i3=check;}

        System.out.printf("%5d %5d %5d",i1,i2,i3);*/

//        문제4 : 가위바위보 게임 구현하기.
//                - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
//                - 승리자 판단과 무승부 경우의수를 출력하시오.
//      [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
//     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
        /*System.out.print("플레이어1 : ");
        int player1=scanner.nextInt();
        System.out.print("플레이어2 : ");
        int player2=scanner.nextInt();

        if(player1==(player2+2)%3){
            System.out.println("player2 승리");
        }
        else if(player1==player2){
            System.out.println("무승부");
        }
        else if(player2==(player1+2)%3){
            System.out.println("player1 승리");
        }
        else{

        }
*/
//        문제5 : 윤년/평년 판단하기
//                [ 입력조건 ] 하나의 연도를 입력 받습니다.
//   [ 윤년/평년 조건 ]
//        -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//        -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
//        -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.
        /*System.out.print("년도를 입력하세요 : ");
        int y=scanner.nextInt();

        if(y%4==0 && y%100==0 && y%400==0){
            System.out.println("입력한"+y+"는 윤년입니다.");
        }
        if(y%4==0 && y%100==0){
            System.out.println("입력한"+y+"는 평년입니다.");
        }
        if(y%4==0){
            System.out.println("입력한"+y+"는 윤년입니다.");
        }*/
//
//                문제6 : 주차 사용요금 계산하기
//                [ 선언 변수 조건 ] 입차시간이 14시30분 입니다. int 시 = 14;  int 분 = 30;
//   [ 입력 조건 ] 현재시간의 시 와 분을 입력받아 각 변수에 저장하시오. *단 입차 시간 이전 으로 입력 할 경우에는 '현재시간오류' 출력하시오.
//   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
        int 시 = 14;  int 분 = 30;
        System.out.print("시를 입력하세요 : ");
        int h=scanner.nextInt();
        System.out.print("분을 입력하세요 : ");
        int m=scanner.nextInt();

        int pay=0;

        if((h*60+m)<(시*60+분)){//현재시간<입차시간
            System.out.println("현재시간 오류");
        }
        else{
        pay=((h*60+m)-(시*60+분))*1000;
        System.out.println("사용요금 : "+pay);
        }


//
//        문제7 : 로그인 처리
//   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
//   [처리출력 조건]
//        1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
//        2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
//        3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'

        /*System.out.print("아이디를 입력하세요 : ");
        String id=scanner.next();
        System.out.print("비밀번호를 입력하세요 : ");
        String pass=scanner.next();

        if(id.equals("admin")){
            if(pass.equals("1234")){
                System.out.println("로그인 성공");
            }
            else{
                System.out.println("비밀번호가 일치하지 않습니다.");
            }
        }
        else{
            System.out.println("아이디가 일치하지 않습니다.");
        }*/

//
//        문제8 : 당첨번호 개수  찾기
//                [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
//   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.

        /*int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int result=0;
        if(a==공1 || a==공2 || a==공3 ){ result++; }
        if(b==공1 || b==공2 || b==공3 ){ result++; }
        if(c==공1 || c==공2 || c==공3 ){ result++; }

        System.out.println("result = " + result);*/


    }//main end
}//class end
