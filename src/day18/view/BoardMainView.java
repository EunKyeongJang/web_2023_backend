package day18.view;

import day18.controller.MemberController;

import java.util.Scanner;

public class BoardMainView {
    //싱글톤
    private BoardMainView(){}
    private static BoardMainView boardMainView =new BoardMainView();
    public static BoardMainView getInstance(){return boardMainView;}
    
    //입력객체
    Scanner scanner=MainView.getInstance().scanner;
    
    //0. 로그인 성공시 출력되는 화면
    public void run(){
        while(true){
            System.out.println("============== ezen 게시판 ===============");
            //추후에 현재 게시물 출력 메소드가 들어갈 자리
            System.out.println("1.글쓰기 | 2.글보기 | 4.글수정 | 5.글삭제 | 6.로그아웃");
            System.out.print("선택>");
            int ch=scanner.nextInt();
            
            if(ch==1){
                BoardView.getInstance().write();
            }
            else if(ch==2){
                BoardView.getInstance().showAll();
            }
            else if(ch==3){
                System.out.println("[안내] 로그아웃 되었습니다.");
                MemberController.getInstance().logout();    //로그아웃 처리 요청
                return; //현재 메소드 종료
            }
        }//w end
    }//m end
}//c end
