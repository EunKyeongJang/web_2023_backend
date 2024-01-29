package day20;

//구현클래스 -> new 구현객체
public class Audio implements RemoteControl{

    //클래스멤버
    //1. 필드 (인스턴스 멤버 vs 정적 멤버)
    private int volume;
    //2. 생성자 (오버로딩)
    //3. 매소드 (인스턴스 멤버 vs 정적 멤버) (오버로딩 vs 오버라이딩)
        //추상메소드 구현
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume=RemoteControl.MAX_VOLUME;
        }
        else if(volume<MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume=volume;
        }
        System.out.println("현재 Audio 볼륨 : "+this.volume);
    }//m end
    //default 메소드 오버라이딩

    //추가 필드 선언
    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume=this.volume;
            System.out.println("무음처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }
        else{
            System.out.println("무음 해제합니다.");
        }
    }//m end
}//c end
