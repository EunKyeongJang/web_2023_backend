package 과제.과제7;

import java.util.ArrayList;

public class MemberDao {
    //싱글톤
    private MemberDao(){}
    private static MemberDao memberDao=new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

    //배열 객체 선언
    ArrayList<MemberDto>memberDtos=new ArrayList<>();

    //회원가입 메소드
    public boolean inputInfo(MemberDto memberDto){
        memberDtos.add(memberDto);
        return true;
    }//m end

    //로그인 메소드
    public boolean logIn(MemberDto memberDto){
        for(int i=0; i<memberDtos.size(); i++){
            if(memberDto.get아이디().equals(memberDtos.get(i).get아이디())
                    && memberDto.get비밀번호().equals(memberDtos.get(i).get비밀번호())){
                return true;
            }
        }
        return false;
    }//m end

    //아이디찾기 메소드
    public String fineId(MemberDto memberDto){
        for(int i=0; i<memberDtos.size(); i++){
            if(memberDto.get이름().equals(memberDtos.get(i).get이름())
                && memberDto.get전화번호().equals(memberDtos.get(i).get전화번호())){
                return memberDtos.get(i).get아이디();
            }
        }
        return null;
    }//m end

    //비밀번호 찾기 메소드
    public String finePass(MemberDto memberDto){
        for(int i=0; i<memberDtos.size(); i++){
            if(memberDto.get아이디().equals(memberDtos.get(i).get아이디())
                    && memberDto.get전화번호().equals(memberDtos.get(i).get전화번호())){
                return memberDtos.get(i).get비밀번호();
            }
        }
        return null;
    }//m end
}//c end
