package day13;

public class SupersonicAieplane extends Airplane{
    /*
    필드/메소드
        1. [내부객체] 선언한 클래스 내 호출시
            - 객체 없이 필드/메소드 호출
            - this.필드/메소드
        2. [외부] 선언한 클래스가 아닌 다른 클래스에서 호출시
            - 인스턴스 필드 : new 이용한 객체가 필수!! : 객체변수명.필드/메소드
            - 정적필드 : 객체가 필요없음 : 클래스명.필드/메소드

            super.fly() : 부모 클래스의 생성자 호출
            => 부모 클래스 생성자가 여러개인경우 골라서 쓸 수 있음(하나만 있으면 안써도 됨)
     */
    //상수선언
    public static final int NORMAL=1;
    public static final int SUPERSONIC=2;
    //인스턴스 필드
    public  int flyMode=NORMAL; //비행 상태
    
    //오버라이딩 메소드;

    @Override
    public void fly() {
        if(flyMode==SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }
        else{
            //+부모메소드를 사용하기 위해 super.메소드()
            super.fly();//부모꺼 호출
           //this.fly(); //fly()함수를 계속 호출하므로 무한루프와같은 효과
        }
    }//m end
}//class end
