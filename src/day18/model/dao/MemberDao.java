package day18.model.dao;

import day18.model.dto.MemberDto;
import day18.view.MemberView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends Dao {
    private MemberDao(){}
    private static MemberDao memberDao=new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }

    //1. [c]회원가입
    public int signup(MemberDto memberDto){
        try {
            //1. SQL 작성 : 변수가 들어갈 자리에는 ?로 대체한다.
            String sql = "insert into member(mid, mpw, mphone) values(?,?,?);";

            //2. SQL 기재
            ps = conn.prepareStatement(sql);
            //?매개변수 대입
            ps.setString(1, memberDto.getMid());//기재된 SQL내 첫번째 ? 에 대입
            ps.setString(2, memberDto.getMpw());//기재된 SQL내 두번째 ? 에 대입
            ps.setString(3, memberDto.getMphone());//기재된 SQL내 세번째 ? 에 대입

            //3. SQL 실행
            int count = ps.executeUpdate();   //executeUpdate()기재된 sql실행하고 insert된 레코드 개수 반환
            if (count == 1) {//만약에 insert처리된 레코드가 1개이면 회원가입 성공
                return 0;
            }
        }
        catch(Exception e){
            System.out.println("[시스템오류] : "+e);
        }

        //4. SQL 결과

        //5. 함수종료
        return 1;//실패
    }//m end

    //2. 아이디 검사용(아이디 중복검사 용도)
    public boolean idCheck(String mid){
        try {
            //1. SQL 작성한다.
            String sql = "select mid from member where mid=?;";
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            //+? 매개변수 대입
            ps.setString(1, mid);//첫번째 ? 에 대입
            //3. SQL 실행한다.
            rs = ps.executeQuery();   //질의 /검색(select) 결과를 rs 인터페이스에 대입한다.
            //4. sql 결과처리
            if (rs.next()) {
                return true;    //중복있음
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;   //중복없음
    }//m end

    //2. 로그인
    public boolean login(MemberDto memeberDto){
        try {
            //1. SQL작성한다.
            String sql = "select*from member where mid=? and mpw=?;";
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            //?매개변수값 대입
            ps.setString(1, memeberDto.getMid());//sql 문법내 첫번째 ?에 매개변수값 대입
            ps.setString(2, memeberDto.getMpw());//sql 문법내 두번째 ?에 매개변수값 대입
            //3.SQL 실행한다.
            rs = ps.executeQuery();
            //4. SQ: 결과처리
            //if/while : 만약에 select의 결과물이 하나의 레코드가 존재하면 성공 아니면 실패
            if (rs.next()) {
                return true;
            }
        }//try end
        catch (Exception e){//sql 문제발생
            System.out.println(e);
        }//catch end

        return false;
    }//m end

    //0. 아이디를 이용한 회원번호 찾기
    public int fineMno(String mid){
        try {
            //1. SQL작성한다.
            String sql = "select mno from member where mid=?";
            //2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            //?매개변수 대입
            ps.setString(1, mid);
            //3. SQL 실행한다.
            rs = ps.executeQuery();
            //4. SQL결과처리
            if (rs.next()) {
                //rs.next() : 다음레코드로 이동
                //rs.get타입(호출할 필드번호 or 필드이름) : 현재 레코드의 필드값 호츌
                return rs.getInt("mno");
            }
        }//try end
        catch(Exception e){
            System.out.println(e);
        }//catch end
        return 0;
    }
}//c end
