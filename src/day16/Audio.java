package day16;

public class Audio implements RemoteControl{
    //인스턴스필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(this.volume>RemoteControl.MAX_VOLUME){
            this.volume=RemoteControl.MAX_VOLUME;
        }
        else if(volume<RemoteControl.MIN_VOLUME){
            this.volume=MIN_VOLUME;
        }
        else{
            this.volume=volume;
        }
        System.out.println("현재 Audio볼륨 : "+this.volume);
    }
}
