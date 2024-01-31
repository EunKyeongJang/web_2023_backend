package day21;

import java.awt.*;

public class Step5 {
    public static void main(String[] args) {
        //1. 버튼 객체 생성
        Button button=new Button();

        //2. 버튼 추상메소드 정의
        button.setClickListner(new Button.ClickListner() {
            @Override
            public void onClick() {
                System.out.println("버튼을 클릭했습니다.");
            }
        });

        //*일반적인 라이브러리 사용법
        java.awt.Button button2=new java.awt.Button();

        //-- 익명구현체가 없을때
            //1. 구현클래스가 필요
        Button.ClickListner cl=new Click();
            //2. 구현객체 만들어서 사용
        button.setClickListner(cl);

    }
}
