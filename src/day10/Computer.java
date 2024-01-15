package day10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Computer {
    //클래스
    //1. 필드
    //2. 생성자
    //3. 메소드
        //0. 고정길이 매개변수
    int sum2(int x, int y){
         int result=x+y;
         return  result;
    }
    
        //1. 가변길이 매개변수 : 고정길이와 같이 사용하는 경우 고정길이 매개변수를 앞에 둔다.
    int sum(int...values){
        System.out.println("values = " + values);
        System.out.println("values="+ Arrays.toString(values));

        int sum=0;

        for(int i=0; i<values.length; i++){
            sum+=values[i];
        }
        return sum;
    }
        //2. 배열 매개변수
    int sum3(int[] values ){
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        return 0;
    }
}
