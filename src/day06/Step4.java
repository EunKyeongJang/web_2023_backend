package day06;

import java.util.Scanner;

public class Step4 {//class start
    public static void main(String[] args) {//main start
        
        //1. 문자열로 받은 금액을 천단위 쉼표를 넣어주는 코드
        Scanner scanner=new Scanner(System.in);
        System.out.print("입력(숫자형식으로 입력받기) : ");
        String money=scanner.nextLine();
            //입력받은 문자열타입의 금액을 천단위 쉼표 넣어주기
        String result="";
        for(int i=0; i<money.length(); i++){//for start
            //i는 0부터 입력받은 문자열길이까지 1씩 증가한다.
            //System.out.println(i);
            System.out.print(money.charAt(i)+"  ");//입력받은 문자열들을 for문 이용한 한 문자씩 추출.

            //천단위쉼표 : 천단위마다, 추가, 패턴 : 3자리 마다(수 % 3==0)
            if(i>0 && (money.length()-i)%3==0){
                result+=",";
            }
            result += money.charAt(i);

        }//for end


        System.out.println("result = " + result);
        
    }//main end
}//class end
