package 과제.과제7;

public class MemberController {
    //싱글톤
    private MemberController(){}
    private static MemberController memberController=new MemberController();
    public static MemberController getInstance(){return memberController;}

    //회원가입 메소드
    public boolean inputInfo(MemberDto memberDto){
        boolean result=MemberDao.getInstance().inputInfo(memberDto);
        return result;
    }//m end

    //로그인 메소드
    public boolean logIn(MemberDto memberDto){
        boolean result=MemberDao.getInstance().logIn(memberDto);
        return result;
    }//m end

    //아이디찾기 메소드
    public String fineId(MemberDto memberDto){
        String result=MemberDao.getInstance().fineId(memberDto);
        return result;
    }//m end

    //비밀번호찾기 메소드
    public String finePass(MemberDto memberDto){
        String result=MemberDao.getInstance().finePass(memberDto);
        return result;
    }//m end
}
