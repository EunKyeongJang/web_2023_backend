package day09;

public class Step1 {//class start
    public static void main(String[] args) {//main start

        //p.231
            //JS코드를 읽어주는 역할 : HTML(JS) <-- 브라우저(프로그램[스레드])
            //JAVA 코드를 읽어주는 역할 : main함수() <-- main 스레드

        // p.233
            //1. 클래스 내 필드/메소드를 사용하기 위해서는 꼭 객체가 필요하다
        //Calculator.powerOn();

        //1. 객체생성(생성자)
        //new Calculator(); // 이렇게만 쓰면 까먹어서 주소값이 사라짐
            //; : 처리 요청(문장 구분 처리)
        Calculator myCalc=new Calculator();

        //2. 객체나 멤버(필드/메소드) 호출
        myCalc.powerOn();
            //vs
        new Calculator().powerOn();

        //3. 메소드 호출하고 매개변수 전달
        myCalc.plus(5,6);
        //myCalc.plus("오","육");   //타입이 불일치
            //- 리턴값이 있는 경우에는 변수에 저장
        int result=myCalc.plus(5,6);
        
        //4. 
        int x=10;
        int y=4;
        double result2=myCalc.divide(x, y);
        System.out.println("result2 = " + result2);

        //5.
        myCalc.powerOff();

    }//main end
}//class end
