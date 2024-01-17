package 과제.과제6;

public class Member {
    private String id;
    private String pass;
    private String name;
    private String phone;
    private int age;

    //생성자
    Member(){};
    Member(String id, String pass, String name, String phone, int age){
        this.id=id;
        this.pass=pass;
        this.name=name;
        this.phone=phone;
        this.age=age;
    };


    //getter
    String getId(){return id;}
    String getPass(){return pass;}
    String getName(){return name;}
    String getPhone(){return phone;}
    int getAge(){return age;}

    //setter
    void setId(String id){this.id=id;}
    void setPass(String pass){this.pass=pass;}
    void setName(String name){this.name=name;}
    void setPhone(String phone){this.phone=phone;}
    void setAge(int age){this.age=age;}
}
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기

		2. 조건 기능
			1. 회원가입 메소드
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장
				2. Member 객체화
				3. 객체를 배열 저장

			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공
					- 아니면 실패

			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력
					- 아니면 없다.

			4. 비밀번호찾기 메소드
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.


*/