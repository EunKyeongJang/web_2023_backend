package day18.model.dao;

import day18.model.dto.BoardDto;

public class BoardDao extends Dao{
    private BoardDao(){}
    private static BoardDao boardDao=new BoardDao();
    public static BoardDao getInstance(){
        return boardDao;
    }

    //카테고리 추출
    public String selectC(int cno){
        String result=null; //실행결과 저장 변수
        try {
            String sql = "select cname from category where cno=?;";
            //sql기재
            ps = conn.prepareStatement(sql);

            //?값 대입
            ps.setInt(1, cno);

            //sql 실행결과 저장
            rs= ps.executeQuery();

            //실행결과 추출
            if(rs.next()){
                result=rs.getString(1);
            }
        }
        catch (Exception e){
            System.out.println("[오류] : "+e);
        }
        return result;
    }

    //글쓰기
    public boolean write(BoardDto boardDto){

        return false;
    }

}//c end
