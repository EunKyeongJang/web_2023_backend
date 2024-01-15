package 팀과제2;

public class Client {
    String id="admin";
    String pw="1234";
    int 구독기간;
    String 서비스형태;

    @Override
    public String toString() {
        return  "id='" + id + "\'\n" +
                "구독기간=" + 구독기간 +"\n"+
                "서비스형태='" + 서비스형태 + "\'";
    }
}
