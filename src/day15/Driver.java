package day15;

public class Driver {//운전자(사람)
    //메소드(객체의 행위) : 매개변수로 운전할 배개체(버스/택시)
        //버스와 택시를 모두 매개변수로 받고 싶을때 상위클래스
    public void drive(Vehicle vehicle){
        vehicle.run();
        //- 자식타입으로 다시 변환(강제타입변환 = 캐스팅)
        //!! :instanceof 연산자
        //객체명 instanceof 타입
        System.out.println(vehicle instanceof Bus);
        System.out.println(vehicle instanceof Texi);
        System.out.println(vehicle instanceof Object);

        Bus bus2=new Bus(); //가식객체는 생성 시 부모객체도 먼저 생성한다.
        System.out.println(bus2 instanceof Vehicle);
        //Object : 자바의 모든 클래스의 최상위 부모
        System.out.println( vehicle instanceof Object);
    }
}
