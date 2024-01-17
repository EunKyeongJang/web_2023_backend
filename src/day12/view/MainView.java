package day12.view;

import day12.controller.MemberController;
import day12.model.MemeberDto;

import java.util.Scanner;

//view : 화면구현(입출력)
public class MainView {
    /*
        싱글톤 : 프로그램 내 하나의 객체를 사용할때 사용하는 패턴
        //1. 생성자 private
        //2. 필드에 본인 객체르르 생성한다. private static
        //3. 객체를 외부로부터 전달하기 위한 함수 getInstance()
     */
    private MainView(){}
    private static MainView mainView=new MainView();
    public static MainView getInstance(){return mainView;}
    //멤버
    //1. 필드
    Scanner scanner=new Scanner(System.in);
        //지역변수 : 스택영역에 존재, 해당 함수 내에서만 사용 가능
        //인스턴스 필드 : 힙 영역에 존재, 외부에서도 사용 가능(정적필드 제외)
    //2. 생성자
    //3. 메소드
    public void run(){
        while(true){
            System.out.println("=====메인페이지=====");
            System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호 찾기");
            System.out.print("선택 > ");
            int ch=scanner.nextInt();
            scanner.nextLine();
            
            if(ch==1){//회원가입 페이지 이동
                MemberView.getInstance().signup();  //MemberView signup 메소드 이동
            }
            else if(ch==2){//로그인 페이지 이동
                MemberView.getInstance().login();
            }
            else if(ch==3){//아이디 찾기 페이지 이동
                MemberView.getInstance().findId();
            }
            else if(ch==4){
                MemberView.getInstance().newpass();
            }
        }
    }//f end


}
