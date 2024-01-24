package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        }
        catch (ClassNotFoundException e){   //예외클래스 정보를 매개변수로 받는다.
            System.out.println("[시스템오류] : JDBC 드라이버 클래스를 찾지 못했습니다."+e);
        }


        try {//만약에 해당 연동할 db서버의 정보가 잘못되거나 db서버쪽에 문제가 발생했을때 대처
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",        //1. DB서버주소(jdbc:mysql://ip주소:port번호/DB명)
                    "root",                                         //2. DB서버 계정명
                    "1234");                                        //3. DB서버 계정 비밀번호
            System.out.println("[시스템 정보] : DB서버와 연동 성공했습니다.");
        }
        catch(SQLException e){
            System.out.println("[시스템오류] : MYSQL서버와 연동이 실패했습니다.");
        }
    }//m end
}//c end

//만약에 해당 클래스를 못찾았을때 대처
//1. Class.forName(); 현재 프로젝트내 클래스 찾고 메모리로 로딩한다.
    //1. mySQL회사 driver 클래스를 찾기 : com폴더 내 mysql폴더 내 cj폴더 내 jdbc 폴더 내 driver 존재(공문에 나와있음)
    //2. 해당 폴더 내 driver 클래스를 찾는 과정에서 오류가 발생할수도 있다.
    //- ClassNotFoundException : 클래스를 찾지 못했다는 뜻
    //예외/오류 처리 : 1.일반예외 2.실행예외
//2. Connection : db 연동 인터페이스
    //인터페이스 타입으로 변수선언
    //Connection connection;
    //인터페이스는 스스로 객체를 만들 수 없다.[추상]
    //!! : 구현체(구현객체 - 구현클래스(implements)로 생성된 객체)
    //riverManager.getConnection("DB서버주소/DB명", "계정명,"비밀번호") : 연동해서 연동된 구현체 대입
    //localhost : 현재pc라는 의미

/*
    예외/오류 처리 : 1.일반예외 2.실행예외
        - 예외/오류가 발생했을때 대처하기위해
        1. 일반예외 : 컴파일시 예외 체크 = 컴파일시 예외/오류 발생
            - 실행전에 미리 오류가 발생한다.
            - 자바 외부와 통신하는 클래스들(키보드, db서버, 파일처리 등등)
            - 1. Scanner클래스
            - 2. DAO(Data Access Object) : 주로 DB연동/조작 객체

        2. 실행예외 : 실행중에 예외 체크 = 실행중에 예외/오류 발생
            - 미리 대처하기 힘듦 - 미리 예외/오류 알고있는 상태 = 경험을 통한 대처
            1. NullPointerException

    예외/오류 처리
        - 만약에 예외가 발생할 것 같은 코드에 처리
        - 문법
            try{} catch (예외클래스명 변수){}
 */