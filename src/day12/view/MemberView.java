package day12.view;

import day12.controller.MemberController;
import day12.model.MemeberDto;

import java.util.Scanner;

//view : 화면구현(입출력)
public class MemberView {

    //싱글톤
    private MemberView(){}
    private static MemberView memberView=new MemberView();
    public static MemberView getInstance(){return memberView;}

    //1. 회원가입 메소드
    public void signup(){
        System.out.println("[1] MemberView.signup");
        //MainView.getInstance() : 싱글톤(미리 만들어진 단 하나의 객체 호출
        Scanner scanner=MainView.getInstance().scanner;

        //1. 입력
        System.out.print("아이디 : ");
            String id=scanner.nextLine();
        System.out.print("비밀번호 : ");
            String pw=scanner.nextLine();
        System.out.print("이름 : ");
            String name=scanner.nextLine();
        System.out.print("전화번호 : ");
            String phone=scanner.nextLine();

        //2. 객체화
        MemeberDto memeberDto=new MemeberDto(0,id,pw,name,phone);
        
        //3. 객체를 컨트롤에게 전달(매개변수/회원가입 필요산 정보.객체) 후 
            // 처리 결과(리턴/회원가입 처리 결과(t 성공/f 실패) or byte 등등)을 받기
        boolean result= MemberController.getInstance().signup(memeberDto);
        System.out.println("[5]result = " + result);
        //4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("안내) 회원가입 성공");
        }
        else{
            System.out.println("안내) 회원가입 실패");
        }
        
    }

    //2. 로그인 메소드(로그인 : 데이터 비교하는 작업)
    public void login(){
        System.out.println("[1]MainView.login");

        //1. 입력받기
        Scanner scanner=MainView.getInstance().scanner;
        System.out.print("아이디:");
        String id=scanner.next();
        System.out.print("비밀번호");
        String pw=scanner.next();

        //2. 객체 vs 2개 문자열
        MemeberDto memeberDto=new MemeberDto();
        memeberDto.setId(id);
        memeberDto.setPw(pw);

        //3. 컨트롤에게(로그인에 필요한 정보) 전달하고 결과(boolean) 받기
        boolean result=MemberController.getInstance().login(memeberDto);
        System.out.println("[5] result = " + result);
        
        //4. 결과에 따른 처리
        if(result){
            System.out.println("로그인성공");
            //로그인 성공 시 사용할 서비스의 view로 이동
        }
        else{
            System.out.println("로그인 실패");
        }
    }//fuction end

    //3. 아이디찾기 메소드
    public void findId(){
        //1. 입력받기
        Scanner scanner=MainView.getInstance().scanner;
        System.out.print("이름:");
        String name=scanner.next();
        System.out.print("전화번호 :");
        String phone=scanner.next();

        MemeberDto memeberDto=new MemeberDto();
        memeberDto.setName(name);
        memeberDto.setPhone(phone);

        String resultId=MemberController.getInstance().findId(memeberDto);

        System.out.println("아이디: "+resultId);

    }//f end

    //4. 새로운 비밀번호 발급 메소드
    public void newpass(){
        Scanner scanner=MainView.getInstance().scanner;

        //입력
        System.out.print("아이디 : ");
            String id=scanner.next();
        System.out.println("전화번호 : ");
            String phone=scanner.next();

        MemeberDto memeberDto=new MemeberDto();
        memeberDto.setId(id);
        memeberDto.setPhone(phone);

        String result=MemberController.getInstance().newpass(memeberDto);

        System.out.println(memeberDto.getId()+"님의 새로운 비밀번호 : "+result);
    }
}//c end
