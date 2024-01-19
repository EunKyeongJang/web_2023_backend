package day14;

/*
        A
    B       C
    D       E
 */
class A{}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}

public class Step1 {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        D d=new D();
        E e=new E();

        //A 타입으로 자동 타입변환
        A a1=b;
        A a2=c;
        A a3=d;
        A a4=e;

        //B, C 타입으로 자동 타입 변환
        B b1=d;
        C c1=e;
            //불가능
        /*
        B b3=e;
        C c2d;
        */

    }//m end
}//e end

