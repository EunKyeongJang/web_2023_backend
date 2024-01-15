package day10;

public class Car2 {//class start
    
    //멤버
    //1. (정적/인스턴스) 필드
    int speed;  //인스턴스 필드
    static int speed2;
    
    //2. 생성자
    //3. (정적/인스턴스) 메소드
    void run(){ }//인스턴스 메소드

    static void simulate(){
        //System.out.println(this.speed);//static 메소드에서 인스턴스 필드 호출 불가능
        System.out.println(speed2);     //static 메소드에서 정적필드 호출 가능
        //this 는 해단 메소드를 실행한 객체의 주체자.
        //static는 객체 없이 사용하는 메소드/필드 이니까 곧 this가 없다.
    }
    void simulate2(){
        System.out.println(this.speed);//인스턴스 메소드에서 인스턴스 필드 호출 가능
        System.out.println(speed2);    //인스턴스 매소드에서 정적필드 호출 가능
    }

    public static void main(String[] args) {//main함수는 클래스 없이 자바를 실행하므로 정적 메소드로 사용
        simulate();     //static구역에서 static 메소드 호출 가능
        //simulate2();    //static 구역에서 인스턴스 메소드 호출 불가능
            //해결책 : 객체 만들자
         new Car2().simulate2();
        
    }
}//class end
