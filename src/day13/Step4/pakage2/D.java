package day13.Step4.pakage2;

import day13.Step4.pakage1.A;

//pakage2 폴더
public class D extends A {  //자식객체가 만들어질때 부모객체 자동으로 생성
    public D(){super();}    //부모의 생성자 호출
    public void method1(){
        this.field="value"; //부모의 필드 호출
        this.method();  //부모의 메소드 호출
    }
    public void method2(){
        //A a=new A();      //직접 객체 생성해서 사용하는 것은 안됨
        //a.field="value";
        //a.method();
    }
}
