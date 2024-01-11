package day04;

import java.util.Random;

public class Step1 {//class start
    public static void main(String[] args) {// main start

        //p.110
            //제어문 : 1.조건문 2.반복문
            //흐름제어 : 조건문( {} 이후 정상흐름 )
            //          반복문( {} 이후 제어문으로 되돌아감 ) - 루핑
        //if 문
            //if(조건식){ 실헹문; 실행문; }
            //if(조건식) 실행문;
        //p.111
        int score=93;   //1.변수선언

        if(score>=90){//if start
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }//if end
        if(score<90)
            System.out.println("점수가 90점보다 적습니다.");
            System.out.println("등급은 B등급입니다.");  //if 조건식에 관련 없이 무조건 실행

        //주사위 난수 : 1~6 사이의 난수 생성
        //1.
        //int num=Math.random();  //0.xx ~ 1.xx
        //int num=Math.random()*6;  //0.xx ~ 1.xx * 6  => 0 ~ 6 미만
        //int num=Math.random()*6+1;  //0.xx ~ 1.xx * 6 + 1 => 1 ~ 7 미만
        int num=(int)(Math.random()*6+1);   //(int) 0.xx ~ 1.xx * 6 + 1 => 1 ~ 7 미만 => 1 ~ 6

        //2.
        Random random=new Random();
        //클래스명 변수명 = new 클래스명();    //클래스에 해당하는 객체 생성 (객체 만드는 이유 : 라이브러리(미리 만들어진 코드))
        //int num2=random.nextInt();    //int 허용범위내 난수 생성 +-21억 정도 중 난수
        //int num2=random.nextInt(6); //0 ~ 6 미만
        int num2=random.nextInt(6)+1;   //0 ~ 6미만 + 1 => 1 ~ 7 미만 => 1 ~ 6

        if(num2==1){
            System.out.println("주사위 1 입니다.");
        }
        else if(num2==2){
            System.out.println("주사위 2 입니다.");
        }
        else if(num2==3){
            System.out.println("주사위 3 입니다.");
        }
        else if(num2==4){
            System.out.println("주사위 4 입니다.");
        }
        else if(num2==5){
            System.out.println("주사위 5 입니다.");
        }
        else{
            System.out.println("주사위 6 입니다.");
        }




    }//main end
}//class end
