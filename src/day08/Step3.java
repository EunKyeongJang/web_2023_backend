package day08;

public class Step3 {//class start
    public static void main(String[] args) {//main start

        //0. 기본생성자로 객체 생성
        //이미 생성자 초기화가 된 상태라서 기본생성자를따로 선언하지 않으면 사용할 수 없다.
        Korean k=new Korean();
        System.out.println("k = " + k);
        k.name="이자바";
        k.ssn="800423-1234567";
        System.out.println();
        System.out.println("k = " + k);

        //1. 정의된 생성자로 객체 생성
        Korean k1=new Korean("박자바", "011225-1234567");
        System.out.println(k1);

        Korean k2=new Korean("김자바","930525-0654321");
        System.out.println(k2);

    }//main end
}//class end
