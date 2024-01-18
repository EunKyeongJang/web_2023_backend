package 과제.과제7;

import java.util.Scanner;

public class MemberView {
    private MemberView(){}
    private static MemberView memberView=new MemberView();
    public static MemberView getInstance(){return memberView;}

    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n\n--------- 회원 시스템 ---------");
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
            int ch = memberView.scanner.nextInt();

            if( ch == 1 ) {//회원가입
                //입력
                System.out.print("아이디 : ");
                    String id=memberView.scanner.next();
                System.out.print("비밀번호 : ");
                    String pass=memberView.scanner.next();
                System.out.print("이름 : ");
                    String name=memberView.scanner.next();
                System.out.print("전화번호 : ");
                    String phone=memberView.scanner.next();
                System.out.print("나이 : ");
                    int age=memberView.scanner.nextInt();
                    
                //입력받은 회원정보 대입
                MemberDto memberDto=new MemberDto(id, pass, name, phone, age);
                
                //MemberController에 넘기기
                boolean result=MemberController.getInstance().inputInfo(memberDto);
                
                //결과 출력
                if(result){
                    System.out.println("★회원가입 완료★");
                }
                else{
                    System.out.println("※회원가입 실패");
                }
            }//if end ch==1
            else if( ch == 2 ) {//로그인
                //입력
                System.out.print("아이디 : ");
                String id=memberView.scanner.next();
                System.out.print("비밀번호 : ");
                String pass=memberView.scanner.next();

                //입력정보 저장
                MemberDto memberDto=new MemberDto();
                memberDto.set아이디(id);
                memberDto.set비밀번호(pass);

                //MemberController에 넘기기
                boolean result=MemberController.getInstance().logIn(memberDto);

                //결과 출력
                if(result){
                    System.out.println("★로그인 성공★");
                }
                else{
                    System.out.println("※로그인 실패");
                }
            }//else if end ch==2
            else if( ch == 3 ) {//아이디 찾기
                //입력
                System.out.print("이름 : ");
                String name=memberView.scanner.next();
                System.out.print("전화번호 : ");
                String phone=memberView.scanner.next();

                //입력정보 저장
                MemberDto memberDto=new MemberDto();
                memberDto.set이름(name);
                memberDto.set전화번호(phone);

                //MemberController에 넘기기
                String result=MemberController.getInstance().fineId(memberDto);

                //결과 출력
                if(result!=null){
                    System.out.println("찾은 아이디 : "+result);
                }
                else{
                    System.out.println("※해당하는 회원정보가 없습니다.");
                }
            }//else if end ch==3
            else if( ch == 4 ) {//비밀번호 찾기
                //입력
                System.out.print("아이디 : ");
                String id=memberView.scanner.next();
                System.out.print("전화번호 : ");
                String phone=memberView.scanner.next();

                //입력정보 저장
                MemberDto memberDto=new MemberDto();
                memberDto.set아이디(id);
                memberDto.set전화번호(phone);

                //MemberController에 넘기기
                String result=MemberController.getInstance().finePass(memberDto);

                //결과 출력
                if(result!=null){
                    System.out.println("찾은 비밀번호 : "+result);
                }
                else{
                    System.out.println("※해당하는 회원정보가 없습니다.");
                }
            }//else if end ch==4
        }//w end
    }//main end
}//c end
