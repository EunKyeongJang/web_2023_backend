package day15;

import java.awt.event.TextEvent;

public class Step1 {//c start
    public static void main(String[] args) {//m start
        //1. (운전자) 객체생성
        Driver driver1=new Driver();    //1명
        Driver driver2=new Driver();    //1명
        //2. 객체생성
        Bus bus=new Bus();
        driver1.drive( bus );     //버스운전
        //3. 객체생성
        Texi texi=new Texi();       //택시 생성
        driver2.drive(texi);        //택시A로 변경

        driver2.drive(texi);        //운전자2 택시A 운행
        Texi texi2=new Texi();
        driver1.drive(texi);        //운전자1 택시2 운행

        /*Vehicle vehicle=new Vehicle();
        Bus.run();*/

    }//m end
}//c end
