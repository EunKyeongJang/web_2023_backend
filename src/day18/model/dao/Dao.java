package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    /*
        접근제한자
        public          : 모든패키지 접근 가능
        private         : 현재클래스 접근 가능
        protected       : 동일패키지 접근 가능 + 상속관계 가능
        default(생략시)  : 동일패키지 접근 가능

        클래스 : public, default
        필드   : public, private, protected, default
        생성자 : public, private, protected, default
        메소드 :public, private, protected, default

     */
    //1. 필드
    //DB연동 관련 인터페이스
    //1. DB연동객체 : 여러 메소드에서 사용하기 위해 밖으로 꺼냄
    protected Connection conn;
    //2. 작성된 SQL 가지고 있고, 매개변수, 실행 담당
    protected PreparedStatement ps;
    //3. sql 실행결과
    protected ResultSet rs;

    //싱글톤
    protected Dao(){//생성자 : 객체 생성 시 초기화 담당
        //- 객체 생성 시 db연동
        try {
            //1. mysql회사의 jdbc관련된 (Driver)객체를 JVM에 로딩한다.(import와 비슷)
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. 연동된 결과의 (구현체)객체를 Connection인터페이스에 대입한다.
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root",
                    "1234"
            );
            System.out.println("DB연동 성공");
        }
        catch(Exception e){
            System.out.println("연동실패 : "+e);
        }

    }
}
