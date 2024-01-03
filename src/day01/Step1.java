package day01;  //패키지(폴더)

public class Step1 {    //클래스 선언
    //1. 소문자로m -> 엔터
    //2. sout -> 엔터
    //3. System.out.println("하고싶은말");
    //4. [실행] 컨트롤+시프트+f10

    //public class : 클래스 선언 [자바는 무조건 클래스 단위 -> 모든 코드는 클래스 안에서만 작성해야한다.
    //클래스 명 : step1
    //*솟자시작X, 공백X, 첫글자 대문자
    //{ } : 클래스 블록/ 지역/ 정의하는곳

    public static void main(String[] args) {
        //main : main() 메소드
        //{ } : 메소드 블록/ 지역/ 정하는 곳
        //*실행하면 main() 메소드 블록이 실행된다[ 프로그램의 진입/ 시작점 ]
            //- 실행[선언/정의 말고]은 무조건 main() 안에서 시작한다.
            //- main() 안에 main 스레드 [코드를 읽는 흐름] 포함

        System.out.println("안녕자바");// <-----> console에 출력하는 코드[ JS : console.log ]

        //한줄주석
        /* 여러줄 주석 */
        
        //실행문 : 1. 변수선언, 2. 변수 저장, 3. 메소드 호출
            //코드마다 : 끝마침!![ 생략 시 오류 : java';'expected]

    }   //main end
    //class end
}


