package day20;

public class Step1 {
    public static void main(String[] args) {
        //1. 인터페이스 변수 선언
            //RemoteControl rc;

        //2. 구현객체를 생성한다.
            //new Audio();

        //3. 구현객체의 참조/주소값을 인터페이스 변수에 대입한다.
            //*객체를 참조하는 인터페이스 타입의 변수
            //타입이 다른데 가능한 이유 : 다현성
        RemoteControl rc=new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        //4. 인터페이스의 정적메소드 호출
        RemoteControl.changeBattery();

        //RemoteControl.turnOff3(); -> private 메소드라 호출 불가능
        //rc.turnOff2();    -> 위와 동일
    }//m end
}//c end
/*RemoteControl remoteControl=new RemoteControl() {//익명 구현체
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {

    }
}*/
