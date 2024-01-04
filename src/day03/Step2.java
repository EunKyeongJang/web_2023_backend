package day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Step2 {//class start
    public static void main(String[] args) {//main start
        //객체 사용 이유 : 속성/메소드를 패키지화, 미리설계된 메소드를 쓰기 위해

        //예제1 : 작성자, 내용, 날짜 3가지를 입력받아 출력
        Scanner scanner = new Scanner(System.in);
        /*    //1. 입력,
            System.out.println("작성자 : ");
            String 작성자=scanner.next();

            System.out.println("내용 : ");
            String 내용=scanner.next();

            System.out.println("날짜 : ");
            String 날짜=scanner.next();
            //2. 입력받은 데이터 출력
        System.out.printf("=============방문록==============\n");
        System.out.printf("%4s %10s %20s %10s\n","번호","작성자","내용","날짜");
        System.out.printf("%4s %10s %20s %10s\n",1,작성자,내용,날짜);

        System.out.println("=============방문록==============\n");
        System.out.println("번호|작성자|내용|날짜");
        System.out.println(01+"|"+작성자+"|"+내용+"|"+날짜);*/

        //예제2 : 기본급과 수장 정수로 입력받아 실수령액 계산해서 출력
            //실수령액 : 기본급 + 수장 - 세금[기본금10%]
            //실수령액 : 기본금+수당 - 세금(기본급 10%))
        //1. 입력
        System.out.println("기본급 : "); int 기본급=scanner.nextInt();
        System.out.println("수당 : "); int 수당=scanner.nextInt();

        //2. 처리
        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);  //나머지 연산자
        //오류나는 이유 : int-int+int-int*double =>double;
            //0.double형 이므로 int*double 의 결과는double 그래서 double을 int에 대입할 수 없다.

        //3. 출력
        System.out.println("실수령액="+실수령액);

    }//main end
}//class end
