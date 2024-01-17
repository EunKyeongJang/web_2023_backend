package day12.controller;

import day12.model.MemeberDto;
import day12.model.ModelDao;

//contoller : view와 dao의 중계역할
public class MemberController {

    //싱글톤
    private MemberController(){};
    private static MemberController memberController=new MemberController();
    public static MemberController getInstance(){return memberController;}

    //1. 회원가입 메소드
    public boolean signup(MemeberDto memeberDto) {
        System.out.println("[2] MemberController.signup");

        //1. 유효성 검사 처리
        boolean resultId = ModelDao.getInstance().findId(memeberDto.getId());
        if (resultId) {

            //2. view받은 객체를 DAO에게 전달 후 처리결과를 받기
            boolean result = ModelDao.getInstance().signup(memeberDto);
            System.out.println("[4]result = " + result);

            return result;
        }
        else{
            return resultId;
        }
    }//fuction end

    //+로그인 했다는 증거 -로그아웃 하기 전까지. [회원번호 또는 아이디]
    //로그인 상태 필드//null이면 비로그인null 대신에 아이디가 있으면 로그인된 상태
    String  loginSession = null;    //null이면 비로그인 null 대신에 아이디가 있으면 로그인된 상태

    //2. 로그인 메소드
    public boolean login(MemeberDto memeberDto){
        System.out.println("[2] MemberController.login");

       boolean result=ModelDao.getInstance().login(memeberDto);
        System.out.println("[4] result = " + result);

        //+만약에 로그인 성공 시 로그인상태 변경
        if(result){
            //로그인 상태 필드에 로그인 성공한 아이디를 대입한다.
            loginSession=memeberDto.getId();
        }

        return result;
    }

    //3. 아이디찾기 메소드
    public String findId(MemeberDto memeberDto){
        String resultId=ModelDao.getInstance().findId(memeberDto);
        return resultId;
    }

    //4. 새로운 비밀번호 발급 메소드
    public String newpass(MemeberDto memeberDto){
        String result=ModelDao.getInstance().newpass(memeberDto);
        return result;
    }
}
