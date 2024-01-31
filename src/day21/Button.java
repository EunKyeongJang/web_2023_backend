package day21;

public class Button {
    //중첩 인터페이스
    public static interface ClickListner{
        void onClick();
    }

    //필드
    private ClickListner clickListner;

    //메소드
    public void setClickListner(ClickListner clickListner){
        this.clickListner=clickListner;
    }

    //메소드
    public void click(){
        this.clickListner.onClick();
    }
}
