package day18.view;

import day18.controller.BoardController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

public class BoardView {
    //싱글톤
    private BoardView(){}
    private static BoardView boardView=new BoardView();
    public static BoardView getInstance(){return boardView;}
    public void write(){
        //카테고리 출력
        //입력
        System.out.print("카테고리 1.자유게시판 | 2.QnA | 3.리뷰");
        int ch=MainView.getInstance().scanner.nextInt(); //컨트롤러 매개값
        //컨트롤러 호출
        String result= BoardController.getInstance().selectC(ch);
        //호출 결과 출력
        System.out.println("카테고리 : "+result);

        //글쓰기
        //입력
        System.out.println("제목 : ");
        String title=MainView.getInstance().scanner.nextLine();
        System.out.println("내용 : ");
        String content=MainView.getInstance().scanner.nextLine();

        //객체 생성 후 입력값 저장
        BoardDto boardDto=new BoardDto();
        boardDto.setBtitle(title);
        boardDto.setBcontent(content);


    }
}
