package 과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Member[] members = new Member[100];

		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {//회원가입
				//입력
				System.out.print("아이디 : ");
					String id=sc.next();
				System.out.print("비밀번호 : ");
					String pass=sc.next();
				System.out.print("이름 : ");
					String name=sc.next();
				System.out.print("전화번호 : ");
					String phone=sc.next();
				System.out.print("나이 : ");
					int age=sc.nextInt();

				//객체 생성
				Member member=new Member();
				//입력값 객체에 대입
				member.setId(id);
				member.setPass(pass);
				member.setName(name);
				member.setPhone(phone);
				member.setAge(age);

				//객체 배열에 저장
				for(int i=0; i<members.length; i++){
					if(members[i]==null){
						members[i]=member;
						break;
					}//if end
				}//for end

			}//if end ch==1
			else if( ch == 2 ) {//로그인
				//입력
				System.out.print("아이디 : ");
					String id=sc.next();
				System.out.print("비밀번호 : ");
					String pass=sc.next();

				//아이디/비밀번호 존재여부 판별
				boolean check=false;	//계정 존재 확인 변수
				for(int i=0; i<members.length; i++){
					//members가 null이면 반복문 탈출
					if(members[i]==null){
						break;
					}// if end

					//배열 내 아이디와 비밀번호 모두 입력값과 동일한 항목 존재하면 > 로그인 성공
					if(members[i].getId().equals(id) && members[i].getPass().equals(pass)){
						check=true;
						break;
					}//if end
				}//for end

				//결과 출력
				if(check) {
					System.out.println("★로그인 성공★");
				}
				else{
					System.out.println("※로그인 실패");
				}//if end
			}//else if end ch==2
			else if( ch == 3 ) {//아이디 찾기
				//입력
				System.out.print("이름 : ");
					String name=sc.next();
				System.out.print("전화번호 : ");
					String phone=sc.next();
					
				//배열 내 입력 정보와 일치하는 항목 찾기
				String findId=null;	//계정 존재 시 아이디 저장 변수
				
				for(int i=0; i< members.length; i++){
					//members가 null이면 반복문 탈출
					if(members[i]==null){
						break;
					}// if end

					if(members[i].getName().equals(name) && members[i].getPhone().equals(phone)){
						findId=members[i].getId();
						break;
					}//if end
				}//for end
				
				//출력
				if(findId!=null){//아이디가 findId 변수에 저장되었으면
					System.out.println("찾은 아이디 : "+findId);
				}
				else{
					System.out.println("계정정보가 없습니다.");
				}//if end
			}//else if end ch==3
			else if( ch == 4 ) {//비밀번호 찾기
				//입력
				System.out.print("아이디 : ");
					String id=sc.next();
				System.out.print("전화번호 : ");
					String phone=sc.next();

				//입력정보와 동일한 배열 항목 찾기
				String findPass=null;	//계정 존재 시 비밀번호 저장 변수
				for(int i=0; i<members.length; i++){
					//members가 null이면 반복문 탈출
					if(members[i]==null){
						break;
					}// if end

					if(members[i].getId().equals(id) && members[i].getPhone().equals(phone)){
						findPass=members[i].getPass();
						break;
					}//if end
				}//for end

				//출력
				if(findPass!=null){
					System.out.println("찾은 비밀번호 : "+findPass);
				}
				else{
					System.out.println("계정정보가 없습니다.");
				}//if end
			}//else if end ch==4

		} // w e
	} // m e 
} // class e 
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














