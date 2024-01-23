package day16.Step2;

import day13.Step4.pakage2.D;

public class Main {
    public static void main(String[] args) {
        //Driver 객체 생성
        Driver driver=new Driver();

        //Vehicle 구현 객체 생성
        Bus bus=new Bus();
        Taxi taxi=new Taxi();

        //매개값으로 구현객체 대입 -> 다형성(실행결과가 다름)
        driver.drive(bus);  //자동타입변환 -> 오버라이딩 메소드 호출
        driver.drive(taxi);  //자동타입변환 -> 오버라이딩 메소드 호출
    }//m end
}//c end
