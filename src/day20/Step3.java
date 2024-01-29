package day20;

public class Step3 {
    public static void main(String[] args) {
        //1. (구현) 객체
        InterfaceCImpl impl=new InterfaceCImpl();

        //2. 구현객체가 자식과 부모인터페이스의 모두
        InterfaceA ia=impl;
        ia.methodA();
        //ia.methidB();
        //ia.methodC();

        InterfaceB ib=impl;
        //ib.methodA();
        ib.methodB();
        //ib.methodC();

        InterfaceC ic=impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
