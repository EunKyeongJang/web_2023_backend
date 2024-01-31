package day21;

public class Car {
    private Tire tire1=new Tire();
    //익명자식객체
        //- 자식객체 : private Tire tire2=new KumhoTire();
        //- 익명자식객체 : private Tire tire2=new Tire(){재정의};
            //- 클래스가 없다. -> 설계도 없다 -> 재사용 불가능 -> *단일자식객체

    //1. 필드에 익명자식객체 대입
    private Tire tire2=new Tire(){
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체1 이 굴러갑니다.");
        }
    };


    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){
        //2. 지역변수에 익명자식객체 대입
        Tire tire=new Tire(){
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2 가 굴러값니다.");
            }
        };
        tire.roll();
    }

    //3. 매개변수에 익명자식객체 대입
    public void run3(Tire tire){
        tire.roll();
    }
}
