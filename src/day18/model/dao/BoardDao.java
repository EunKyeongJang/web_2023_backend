package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.util.ArrayList;

public class BoardDao extends Dao{
    private BoardDao(){}
    private static BoardDao boardDao=new BoardDao();
    public static BoardDao getInstance(){
        return boardDao;
    }

    //글쓰기
    public boolean write(BoardDto boardDto){
        try {
            String sql = "insert into board(btitle,bcontent,cno,mno,bcount)values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setInt(3, boardDto.getCno());
            ps.setInt(4, boardDto.getMno());
            ps.setInt(5, 0 );

            ps.executeUpdate();
            return true;
        }catch (Exception e ){
            System.out.print(e);
        }
        return false;
    }//m end


    public  ArrayList< CategoryDto > categoryPrint(){
        try{
            String sql ="select * from category";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();


            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();

            while( rs.next() ){

                CategoryDto categoryDto = new CategoryDto();
                categoryDto.setCno(  rs.getInt( "cno") );
                categoryDto.setCname( rs.getString("cname") );

                categoryDtos.add( categoryDto );
            } //
            return categoryDtos;

        }catch (Exception e ){

        }
        return null;
    }//m end

   //모든 게시물 출력
    //boarddto 부분 반환
   public ArrayList<BoardDto> showAllboard(){
        //가변배열 생성
        ArrayList<BoardDto> boardDtos = new ArrayList<>();
        try{
            String sql="select bno, bdate, bcount, btitle from board;";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();


            while(rs.next()){
                BoardDto boardDto=new BoardDto();
                boardDto.setBno(rs.getInt("bno"));
                boardDto.setBdate(rs.getString("bdate"));
                boardDto.setBcount(rs.getInt("bcount"));
                boardDto.setBtitle(rs.getString("btitle"));

                boardDtos.add(boardDto);
            }
            return boardDtos;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    //게시물내 모든 member name 반환
    public ArrayList<String> showAllmember(){
        ArrayList<String> memberNames=new ArrayList<>();
        try{
            String sql="select mname from member;";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                memberNames.add(rs.getString("name"));
            }
            return memberNames;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }


}//c end
