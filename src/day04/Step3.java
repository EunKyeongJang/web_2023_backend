package day04;

import java.util.Scanner;

public class Step3 {//class start
    public static void main(String[] args) {//main start

        //입력 객체 생성
        Scanner scanner=new Scanner(System.in);

        boolean run=true;//무한루프의 상태를 저장하고 있는 변수 [on/off]
        int speed=0;    //현재 속도를 저장하고 있는 변수 [1입력하면 1증가, 2입력하면 1감소]

        while(run){//while start
            //======================무한반복 출력======================//
            System.out.println("------------------------------");
            System.out.println("1.증속(speed 증가) | 2.감속(speed 감소) | 3.중지(무한루프 종료)"); //메뉴판
            System.out.println("------------------------------");
            System.out.print("선택 : ");
            //=======================================================//
            //======================무한반복 입력======================//
            String strNum=scanner.nextLine();//엔터를 입력할때까지 'console이 대기'상태
            //=======================================================//

            //======================입력에 따른 경우의수 판단======================//
            if(strNum.equals("1")){//만약 입력받은 값(문자열) 문자 1이면 [문자 비교시에는 equals()]  //if start
                speed++;    //변수 값 연산
                System.out.println("speed : "+speed);//변수 값 출력
            }
            else if(strNum.equals("2")){//만약에 입력받은 값이 문자 2이면
                speed--;    //변수 값 연산
                System.out.println("speed : "+speed);//변수 값 출력
            }
            else if(strNum.equals("3")){//만약 입력받은 값이 문자 3이면
                //1. while로 다시 이동 -> false 이므로 반복문 종료
                run=false;

                //2. 바로 while 문 탈출
                //break;  //가장 가까운 반복문 탈출
                        //현재 기준에서는 가장 가까운 반복문은 무한루프이므로

                //3. 현재함수{}->(main{}) 탈출 = 프로그램 종료 (main{}함수에는 코드를 읽어주는 스레드 존재.)
                //return; //현재 함수 종료
            }   //if end

        }//while end
    }//main end
}//class end
/*
    무한루프=무한반복
    1.
        while(true){ }
    2.
        boolean run=true;
        while(run){ }
*/