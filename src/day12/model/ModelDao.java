package day12.model;

import java.util.ArrayList;

//DAO : 데이터베이스 접근객체
public class ModelDao {

    //싱글톤
    private ModelDao(){}
    private static ModelDao modelDao=new ModelDao();
    public static ModelDao getInstance(){return modelDao;}
    
    //DB대신에 배열
        //배열 사용 시 불편한점 : 고정길이
        //고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리 : 컬랙션(수집) 프레임워크(라이브러리 집합)
        //컬랙션 프레입워크 : ArrayList 가변길이 배열을 지원하는 클래스
        //ArrayList<[여러개 저장할 객체의 타입]>;       <> : 제네릭
        //제공하는 함수
            //    ArrayList<타입>변수명  vs  타입[]변수명
            //저장 : .add(저장할 객체)         [인덱스]=저장할데이터
                //회원가입
            //개수 : .size(길이)                배열명.length
            //호출 : .get()                     배열명[인덱스]  
                //로그인
            //삭제 : .remove(인덱스)             배열명[인덱스]=null
    //MemeberDto[] memeberDtos=new MemeberDto[100];
    ArrayList<MemeberDto> memeberDtos=new ArrayList<>();

    //아이디 유효성검사
    public boolean findId(String id){
        //아이디 유효성 검사
        for(int i=0; i<memeberDtos.size(); i++) {
            if (id.equals(memeberDtos.get(i).getId())){
                System.out.println("※동일한 아이디가 존재합니다. 회원가입 실패※");
                return false;
            }
        }
        return true;
    }

    //1. 회원가입 메소드
    public boolean signup(MemeberDto memeberDto){
        System.out.println("[3] ModelDao.signup");
        //sql 처리



        memeberDtos.add(memeberDto);
        return true;    //회원가입 성공

        /*
        for(int i=0; i< memeberDtos.length; i++){
            if(memeberDtos[i]==null){
                memeberDtos[i]=memeberDto;
                return true;    //회원가입 성공
            }
        }
         */
        //return false;   //회원가입 실패
    }//fuction end
    
    //2. 로그인 메소드
    public boolean login(MemeberDto memeberDto){
        System.out.println("[3] ModelDao.login");

        //로그인처리 : 전체(배열/arrayList 회원객체 중에 입력받은 동일한 값이 있는지 확인
        for(int i=0; i<memeberDtos.size(); i++){
            //i는 0부터 리스트내 요소 개수까지 1씩 증가
            if(memeberDtos.get(i).getId().equals(memeberDto.getId())){
                //리스트 내 i 번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                if(memeberDtos.get(i).getPw().equals(memeberDto.getPw())){
                    //리스트내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수)같으면
                    return true;
                }
            }
        }
        return false;
    }

    //3. 아이디찾기 메소드
    public String findId(MemeberDto memeberDto){

        String idInfo=null;


        for(int i=0; i<memeberDtos.size(); i++){
            //i는 0부터 리스트내 요소 개수까지 1씩 증가
            if(memeberDtos.get(i).getName().equals(memeberDto.getName())){
                if(memeberDtos.get(i).getPhone().equals(memeberDto.getPhone())){
                    idInfo=memeberDtos.get(i).getId();
                    return idInfo;
                }
            }
        }
        return "존재하는 아이디 정보가 없습니다.";
    }
}
