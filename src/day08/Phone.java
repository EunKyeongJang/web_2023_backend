package day08;

//1. 전화번호 1개에 해당하는 설계도
public class Phone {
    //1. 필드
    String name;
    String number;
    
    //2. 생성자
        //1. 생성자명 : 클래스명 동일
        //2. ()안에 매개변수를 정의한다.
        //3. {}안에 생성자 호출 시 처리할 명령어 작성한다.
    Phone(String name, String number){
        this.name=name;
        this.number=number;
    }
        //<생성자 사용 이유>
        //1. 목적에 따른 객체를 쓸때
        //2. 유효성 검사에 유용
        //3. 관례적으로 캡슐화에 의해서 필드를 잠궈놓는 경우가 있기 때문에
            // 캡슐화 => 외부로부터 필드가 안보이게끔 해놓음
    
    //3. 메소드
}
