package day02;

import java.util.Arrays;

public class Step2 {    //class start
    public static void main(String[] args) {    //main start

        //[p.63] 더하기 vs 연결 연산자
        int result1=10+2+8;     //숫자일 경우에는 연산
        System.out.println(result1 + "10"); //문자열("10")일 경우에는 연결 //2010

        //=>Js -- HTTP통신 기법 이용한 변환 -> JAVA(스크립트는 자바에게 객체를 줄 수 없고, 문자로만 보낼 수 있다.)
        //[p.64] 문자열을 기본타입으로 변환
            //- JAVA 외 어플리케이션과 통신할 때 [메모장, HTTP, 네트워크]
            //- 문자열 -> 기본타입 [타입클래스명.parse~~()]
                //HTTP로부터 10 받음 -> 문자10
                //메모장으로부터 10 받은 -> 문자10
        int value1=Integer.parseInt("10");  //"10" -> 10
        double value2=Double.parseDouble("3.14");    //"3.14" -> 3.14
        boolean value3=Boolean.parseBoolean(("true"));  //"true" -> true
            //- JS에서는 데이터만 비교가 가능하지만 자바는 불가능하다.
        String str="10";
        int value=10;

        // boolean result=str==value? true : false;    //문자열(참조타입)은 연산자[==]를 사용할 수 없다.
        boolean result=Integer.parseInt(str)==value? true : false;  //해결방안
        
            //- 기본타입을 문자열로 변환하는 방법
            //1. Sting.valueOf(기본타입값);
        String str1=String.valueOf(10);
            //2. 기본타입에 의미없는 ""문자열 리터럴 연결한다.
        String str2=10+"";
        
        //[p.66] 변수의 사용범위
            //- 선언된 변수는 해당 중괄호{} 블록 내에서만 사용 가능하고 밖에서는 사용할 수 없다.
        int localValue = 10;
        if(true){   //{}안으로 들어갈 수 있다.
            localValue++;
            //
            int localValue2=20;
        }//if end
        
        //if{} 밖에서 localValue2 호출할 수 없다.
        //localValue++;


        //[p.67] 콘솔로 변수값 출력
            //목적 : 주로 실무에서 활용되는 사용처는 확인용(=console.log)
        System.out.println();
        //System.클래스 : 시스템 관련된 클래스 [다양한 메소드와 속성(필드) 제공]
        //out : 출력 vs in : 입력
        //System.out vs System.in
        //1. println(" ")                    : 콘솔 출력 후 자동 줄바꿈
        //2. print(" ")                      : 콘솔 출력
        //3. printf("형식1 형식2",값1,값2)  : 콘솔 형식에 맞춰 출력

        //[p.69]
        //1. print(리터럴 또는 변수명)
        System.out.print("출력문구1");  //출력만 하고 줄바꿈 안함
        System.out.print("출력문구2");

        //2. println(리터럴 또는 변수명)
        System.out.println("출력문구3");
        System.out.println("출력문구4");

        //3. printf("형식문자1",리터럴 또는 변수명) : 자동완성 souf
            //%d : 정수형식
                //%숫자d : 숫자만큼 자리수 차지, 만일 비어있는 자릿수는 공백처리, 오른쪽 정렬
                //%-숫자d : 숫자만큼 자리수 차지, 만일 비어있는 자릿수는 공백처리, 왼쪽 정렬
                //%0숫자d : 숫자만큼 자리수 차지, 만일 비어있는 자릿수는 '0'처리, 오른족 정렬
            //%f : 실수형식
                //%정수.소수점자리f
            //%s : 문자열 형식
        System.out.printf("%s \n", "출력문구5");

        int valueInt=123;
        System.out.printf("상품의 가격 : %d원 \n", valueInt);
        System.out.printf("상품의 가격 : %6d원 \n", valueInt);
        System.out.printf("상품의 가격 : %-6d원 \n", valueInt);
        System.out.printf("상품의 가격 : %06d원 \n", valueInt);

        double area=3.14159*10*10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f \n", 10, area); //소수점 2자리 출력

        String name="홍길동";
        String job="도적";
        System.out.printf("%6d | %-10s | %10s \n",1,name,job); //소수점 2자리 출력

        //인텔리제이에서 제공하는 자동완성
            //1.sout
        System.out.println();
            //2. souf
        System.out.printf("");
            //3. soutm : 현재 함수명 출력
        System.out.println("Step2.main");
            //4. soutp : 현재 함수의 매개변수 출력
        System.out.println("args = " + Arrays.toString(args));
            //5. soutv : 가장 가까운 변수의 값 출력
        System.out.println("job = " + job);



    }//main end
    
    //main()밖에서 localValue 호출할 수 없다.
    //localValue2++;

    
}//class end
