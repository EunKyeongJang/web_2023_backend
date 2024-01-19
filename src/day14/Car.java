package day14;

public class Car {
    //Tire tire=new KumhoTire();  //부모요소로 자동 타입변환

    //1. 한국타이어 객체 + 하위객체
    //HankookTire hankookTire;

    //2. 금호타이어 객체 + 하위객체
    //KumhoTire kumhoTire;

    //3. 타이어 타입 + 하위객체(한국타이어, 금호타이어)
    Tire tire;

    //4. 객체 + 자바의 모든 객체
    //Object object;

    public void run(){
        this.tire.roll();
    }
}
