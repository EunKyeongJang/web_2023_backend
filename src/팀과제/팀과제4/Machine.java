package 팀과제.팀과제4;

public class Machine {

    //추상메소드 실행 메소드 -> 매개변수 : 인터페이스타입
    void run(Capsule capsule){
        capsule.insert();
    }

    //기타 머신 기능
    public void clean(){
        System.out.println("머신 청소를 시작합니다.");
    }
}
