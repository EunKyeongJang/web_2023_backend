package day11.exam01.pakage1.sub;

import day11.exam01.pakage1.A2;

public class D2 {
    //++++++++++++++++++++++++ 하위패키지 +++++++++++++++++++++++++++
    A2 a1=new A2(true); //public 생성자 가능
    //A2 a2=new A2(1);    //(default) 생성자 가능
    //A2 a3=new A2("문자열");    //private 생성자 불가능(오류 발생)

    //p.268
    public void method(){
        A2 a=new A2();

        //필드호출
        a.field1=1; //public 필드는 같은 패키지에서  접근 가능
        //a.field2=1; //default 필드는 하위패키지에서 접근 불가능
        //a.field3=1; //오류발생 : private 필드는 같은 패키지에서 접근 불가능

        //메소드 호출
        a.method1();    //public 메소드는 같은 패키지에서 접근 가능
        //a.method2();    //default 메소드는 하위패키지에서 접근 불가능
        //a.method3();    //private 메소드는 같은 패키지에서 접근 가능
    }
}
