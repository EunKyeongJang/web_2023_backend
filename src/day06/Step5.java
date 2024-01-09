package day06;

import java.util.Scanner;

public class Step5 {//class start
    public static void main(String[] args) {//main start

        Scanner scanner=new Scanner(System.in);
        System.out.print("시간(hhmmss형식) : ");
        String time=scanner.nextLine();
        System.out.print("시간(숫자) : ");
        String second=scanner.nextLine();

        String result="";
        //입력받은 time에서 second만큼 지난 시간을 hhmmss형식으로 출력

        //System.out.println(Integer.parseInt(time.substring(2,4)));
        int s=Integer.parseInt(time.substring(4))+Integer.parseInt(second);
        int m=Integer.parseInt(time.substring(2,4));
        int h=Integer.parseInt(time.substring(0,2));
            m+=s/60;
            s%=60;

            h+=m/60;
            m%=60;

            h%=24;

        result=String.format("%02d:%02d:%02d",h,m,s);
        //String.format("문자열 형식",대입값) : 문자열 형식대로 문자열을 저장할 수 있음

        System.out.println("result = " + result);

        /*
        예 : time=145930
            second=70
                    result=15:00:40
         */

    }//main end
}//class end
