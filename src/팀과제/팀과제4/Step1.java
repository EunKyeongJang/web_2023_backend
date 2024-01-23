package 팀과제.팀과제4;

public class Step1 {
    public static void main(String[] args) {

        //Machine 객체 생성
        Machine machine = new Machine();

        //Americano 객체 생성
        Americano americano = new Americano();
        //VanillaLatte 객체 생성
        VanillaLatte vanillaLatte = new VanillaLatte();

        //매개값으로 구현객체 대입 -> 다형성(실행결과가 다름)
        machine.run(americano);     //자동타입변환 -> 오버라이딩 메소드 호출
        machine.run(vanillaLatte);  //자동타입변환 -> 오버라이딩 메소드 호출
    }
}
