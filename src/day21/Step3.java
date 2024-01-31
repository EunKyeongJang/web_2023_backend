package day21;

public class Step3 {
    public static void main(String[] args) {
        Car car=new Car();

        //매개변수에 익명자식객체 대입
        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다.");
            }
        });

        //--1
        Tire tire=new Tire(){
            //===== Tire 클래스로부터 상속받은 객체 정의 =====
            //필드 생성 가능
            int a=10;

            //생성자X
            //메소드 생성 가능
            public void method1(){
                System.out.println("ddd");
            }
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다.2");
            }
            //==========================================
        };

        //--2
        car.run3(tire);
    }//m end
}//c end
