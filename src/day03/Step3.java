package day03;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.

        //문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        /*System.out.print("정수를 입력하세요 : ");
        int i2=scanner.nextInt();
        char s2=i2%2==1 ? 'O' : 'X';
        System.out.println(s2);*/

        //문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.


        //문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.

        //문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
        /*System.out.print("정수 1 입력 : ");
        int i41= scanner.nextInt();
        System.out.print("정수 2 입력 : ");
        int i42= scanner.nextInt();
        int i43=i41>i42 ? i41 : i42;
        System.out.println(i43+"가 더 큽니다.");*/


        //문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
        //계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
        /*System.out.print("반지름을 입력하세요 : ");
        int r=scanner.nextInt();
        float s=r*r*3.14F;
        System.out.printf("원의 넓이는 %10.2f 입니다", s);*/

        //문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
        //예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
        /*System.out.print("실수1 입력 : ");
        float f7=scanner.nextFloat();
        System.out.print("실수2 입력 : ");
        f7/=scanner.nextFloat();

        float f77=f7*100F;
        System.out.printf("%10.1f",f77);*/


        //문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
        //계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
       /* System.out.print("윗변 길이 : ");
        float a1=scanner.nextFloat();
        System.out.print("밑변 길이 : ");
        float a2=scanner.nextFloat();
        System.out.print("높이 : ");
        float h=scanner.nextFloat();

        float a=((a1+a2)*h)/2;

        System.out.printf("사다리꼴의 넓이는 %10.1f",a);
        */

       // 문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
                //계산식) 표준체중 계산식 = > (키 - 100) * 0.9
        /*System.out.print("키를 입력하세요 : ");
        int h=scanner.nextInt();
        int 체중=(int)((h-100)*0.9);

        System.out.println("표준체중 : "+체중);*/


       // 문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
        //계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

        //문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
                //계산식) 1 inch -> 2.54cm

        //문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
        //계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

        //문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
        //int x = 10;
        //int y = x-- + 5 + --x;
        //printf(" x의 값 : %d , y의값 :  %d ", x, y)

        //문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

       //문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

        //문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
        String id="admin";
        String pass="1234";

        System.out.print("아이디를 입력하세요 : ");
        String inputId=scanner.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String inputPass=scanner.nextLine();

        String alert=inputId.equals(id) && inputPass.equals(pass)? "로그인성공" : "로그인 실패";

        System.out.println(alert);


        //문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
    }
}
