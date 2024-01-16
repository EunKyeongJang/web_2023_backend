package 과제.과제5;


public class Member {
    String 아이디;
    String 비밀번호;
    String 이름;
    String 전화번호;
    int 나이;

    @Override
    public String toString() {
        return "Member{" +
                "아이디='" + 아이디 + '\'' +
                ", 비밀번호='" + 비밀번호 + '\'' +
                ", 이름='" + 이름 + '\'' +
                ", 전화번호='" + 전화번호 + '\'' +
                ", 나이=" + 나이 +
                '}';
    }
}
