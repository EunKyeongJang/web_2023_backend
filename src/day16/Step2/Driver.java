package day16.Step2;

public class Driver {
    //인터페이스 메소드를 호출하는 메소드 -> 매개변수를 인터페이스타입으로 선언
    void drive(Vehicle vehicle){
        vehicle.run();  //인터페이스 메소드 호출
    }
}
