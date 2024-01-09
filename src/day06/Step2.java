package day06;

import java.util.Scanner;

public class Step2 {//class start
    public static void main(String[] args) {//main start

        //p.153 문자열 타입
        //1. 문자열 선언 : String 클래스 사용한다.
        String name;    //스택영역(변수)선언
        name = "홍길동";   //스택영역에 힙영역(객체)의 주소 대입
        String hobby="여행";  //힙영역(객체)의 주소를 스택영역에 대입

        //2. 문자열 비교
            //1.==
        String name1="홍길동"; //힙영역? " " 리터럴 의미가 문자열 객체 생성
        String name2="홍길동";
        System.out.println(name1==name2);//같다.
            //2. new 연산자 : 객체를 생성할때 사용되는 키워드
        String name3=new String("홍길동");
        System.out.println(name2==name3);//다르다. [스택이 가지는 주소/참조 값 비교]
        //정리 : 리터럴로 생성하면 내용이 같을때 주소값 공유 ==true, new 연산자로 생성하면 주소값 다름 ==false

            //3. .접근연산자 : 현재참조(객체)로 이동
        System.out.println(name1.equals(name2));    //같다.
        System.out.println(name1.equals(name3));    //같다. [스택이 가지는 주소/참조의 내부 비교]

            //4.
        Scanner scanner=new Scanner(System.in);
        String inputName=scanner.next();    //입력받은 문자열이 반환된 문자열은 리터럴인지, new 문자열인지 => 새로운 문자열(new)로 반환됨

        System.out.println(name1==inputName);
        System.out.println(name1.equals(inputName));
        
            //5. null(객체없음) vs "" vs " "
        String hobby2="";
        if(hobby2.equals("")){
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
        String hobby3=null;

        //프로그램 도중에 hobby변수의 참조값이 변경될 수 있으므로

        if(hobby3!=null && hobby3.equals("")){  //.NullPointerException : 객체 없으므로 오류

        }


    }//main end
}//class start
