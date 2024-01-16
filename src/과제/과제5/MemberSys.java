package 과제.과제5;

import java.util.Arrays;
import java.util.Scanner;

public class MemberSys {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//객체를 배열에 저장
		Member[] memArray=new Member[0];
		
		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인    선택> ");
			int ch = sc.nextInt();
			sc.nextLine();

			if( ch == 1 ) {
				//입력
				System.out.print("아이디 : ");
					String id=sc.nextLine();
				System.out.print("비밀번호 : ");
					String pass=sc.nextLine();
				System.out.print("이름 : ");
					String name=sc.nextLine();
				System.out.print("전화번호 : ");
					String no=sc.nextLine();
				System.out.print("나이 : ");
					int age=sc.nextInt();
				
				//Member 객체화
				Member member=new Member();
				member.아이디=id;
				member.비밀번호=pass;
				member.이름=name;
				member.전화번호=no;
				member.나이=age;

				Member[] temp=new Member[memArray.length];//배열 스왑용

				//배열 스왑
				for(int i=0; i<memArray.length; i++){
					temp[i]=memArray[i];
				}

				//기존배열 길이 추가
				memArray=new Member[memArray.length+1];

				//스왑배열 -> 기존배열 + 새로 입력받은 Member
				for(int j=0; j<temp.length; j++){
					memArray[j]=temp[j];
				}
				memArray[memArray.length-1]=member;
			}
			else if( ch == 2 ) {
				//입력
				System.out.print("아이디 : ");
					String id=sc.nextLine();
				System.out.print("비밀번호 : ");
					String pass=sc.nextLine();
					
				//비교
				boolean check=false;
				for(int i=0; i< memArray.length; i++){
					if(id.equals(memArray[i].아이디) && pass.equals(memArray[i].비밀번호)){
						check=true;
					}
				}

				//출력
				if(check){
					System.out.println("로그인 성공");
				}
				else{
					System.out.println("로그인 실패");
				}
					
			}// if end

		} // w e 
	} // m e 
} // c e 


/*
 	주제 : 회원제 시스템 part1
 		- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 새로운 메소드를 생성 하지 마시오.

 		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이

		[ MemberSys 클래스 ]
 		1. 초기 메뉴 [ 무한루프 ]
 			1. 회원가입 2.로그인 
 			
 		2. 조건 기능 
 			1. 회원가입 선택시
 				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
 				2. Member 객체화
 				3. 객체를 배열 저장 
 				 
 			2. 로그인 선택시
 				1. 아이디 , 비밀번호 입력받아 저장 
 				2. 입력받은 값과 배열내 동일한 값 찾기
 					- 만약에 동일한 값 있으면 로그인 성공 
 					- 아니면 실패
*/





