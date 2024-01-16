package day11;

import java.security.Signature;

public class Step3 {
    public static void main(String[] args) {
        //외부로부터 생성자를 private 했기때문에 사용 불가능
        //Singleton singleton=new Singleton();

        //1. 싱글톤 호출
        Singleton obj1=Singleton.getInstance();
        //2. 싱글톤 호출
        Singleton obj2=Singleton.getInstance();

        //3. 두 변수가 가지는 참조값은 같다.
        System.out.println(obj1==obj2); //true
    }
}
