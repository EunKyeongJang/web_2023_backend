package day21;

public class InsufficientException extends Throwable{

    //예외클래스 만들기
    //1. Exception 클래스로 부터 상속 받는다.
    //2. 생성자에 super(message); 작성한다.
    public InsufficientException(){}
    public InsufficientException(String message){
        super(message);    //super : 상위클래스  vs  this : 본인객체
        /*
                    super       vs          this
            필드      X                   this.필드명
            생성자     super()             X
            메소드     super.메소드명()      x
         */
    }
}
