package day13;

/*
    클래스 - (접근제한자 public/default) (final) class 클래스명{}
    필드 - (접근제한자 public/default/private/protected) (정적static/인스턴스) (final) 타임 필드명;
    생성자 - (접근제한자 public/default/private/protected) 생성자(){}
    메소드 - (접근제한자 public/default/private/protected) (정적static/인스턴스) (final) 반환타입 메소드명(){}

    - 지역변수 : 함수안에서
       (final) 타입 변수명;
       **변수는 접근제한자 사용 x
   
   - 정적멤버는 인스턴스멤버 호출 못함 -> 객체 생성 후 호출 가능
 
       
 */
public class SportCar extends Car{
    //1. final 없는 메소드는 오버라이딩 가능
    @Override
    public void speedUp() {
        speed+=10;
    }

    //2. final 있는 메소드는 오버라이딩 불가능
    //@Override
    /*public void stop(){
        System.out.println("스포츠카를 멈춤");
        speed=0;
    }*/
}
