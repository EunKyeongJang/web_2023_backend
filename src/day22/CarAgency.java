package day22;
//클래스 : implements 하면 구현클래스라고 한다.

public class CarAgency implements Rantable<Car2>{
    @Override
    public Car2 rent() {
        return new Car2();
    }
}
