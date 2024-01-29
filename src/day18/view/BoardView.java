package day18.view;

import day18.controller.BoardController;
import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardView {
    //싱글톤
    private BoardView(){}
    private static BoardView boardView=new BoardView();
    public static BoardView getInstance(){return boardView;}
    public void write(){
        //카테고리 출력
        //입력
        ArrayList< CategoryDto > cArray=BoardDao.getInstance().categoryPrint();
        for(int i=0; i<cArray.size(); i++){
            System.out.printf("%d.%s \t",cArray.get(i).getCno(), cArray.get(i).getCname());
        }
        System.out.print("\n선택>");
        int cno = MainView.getInstance().scanner.nextInt();
        MainView.getInstance().scanner.nextLine();
        //글쓰기
        //입력
        System.out.print("제목 : ");
        String title=MainView.getInstance().scanner.nextLine();
        System.out.print("내용 : ");
        String content=MainView.getInstance().scanner.nextLine();

        //객체 생성 후 입력값 저장
        BoardDto boardDto=new BoardDto();
        boardDto.setBtitle(title);
        boardDto.setBcontent(content);
        boardDto.setCno(cno);

        //결과출력
        boolean wResult=BoardController.getInstance().write(boardDto);
        if(wResult){
            System.out.println("게시물이 등록되었습니다.");
        }
        else {
            System.out.println("게시물 등록에 실패하였습니다.");
        }
    }//m end

    //모든 게시물 출력
    public void showAll(){
        System.out.println("==============EZEN게시물==============");
        System.out.printf("%10s %10s %10s %10s %10s %10s\n","게시물번호", "카테고리", "작성자", "작성일", "조회수", "제목");
        //System.out.printf("%10s %10s %10s %10s %10s %10s\n",); 여기까지 함

    }
}//c end