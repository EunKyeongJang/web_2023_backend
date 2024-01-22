package day15;

public class SmartPhone extends Phone{//부모 생성자 중 기본생성자가 없으면 그냥 상속했을경우 오류 발생
    //부모 생성자를 호출
    SmartPhone(String owner){
        super(owner);
    }
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
