package day13;

public class Computer extends Calculator{

    /*
    오버라이딩 
    - 부모에게 물려받은 메소드가 이상적으로 적합하면 좋지만 아닐경우 재정의
    1. 상위클래스의 메소드 재 정의한다.
    2. 재정의(override)된 메소드가 우선순위 갖는다.
     */
    @Override
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return Math.PI*r*r;    }

}
