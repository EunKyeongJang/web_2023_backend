package 과제.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		System.out.print("회원명 String : ");
		output=scanner.next();

		System.out.print("상태 boolean : ");
		boolean bool=scanner.nextBoolean();

		System.out.print("회원번호 byte : ");
		byte b=scanner.nextByte();

		System.out.print("성별 char : ");
		char c=scanner.next().charAt(0);

		System.out.print("나이 short : ");
		short s=scanner.nextShort();

		System.out.print("포인트 int : ");
		int i=scanner.nextInt();

		System.out.print("예금액 long : ");
		long l=scanner.nextLong();

		System.out.print("키 float : ");
		float f=scanner.nextFloat();

		System.out.print("몸무게 double : ");
		double d=scanner.nextDouble();

		System.out.println("==========회원 개인정보===========");
		System.out.printf("|\t\t%-10s  %s","회원명 : "+output,"\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","상태 : "+bool,"\t\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","회원번호 : "+b,"\t\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","성별 : "+c,"\t\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","나이 : "+s,"\t\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","포인트 : "+i,"\t\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","예금액 : "+l,"\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","평균 : "+f,"\t\t\t|\n");
		System.out.printf("|\t\t%-10s  %s","평균 : "+d,"\t\t\t|\n");
		System.out.println("===============================");


		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
