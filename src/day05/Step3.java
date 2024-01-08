package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Step3 {//class start
    public static void main(String[] args) {//main start

        //*입력객체
        Scanner scanner=new Scanner(System.in);
        //5-1. 저장할 (배열)변수 선언
        String[] 내용배열=new String[3];
        String[] 작성자배열=new String[3];
        int[] 비밀번호배열=new int[3];

        //1. 무한루프
        while(true){//while start
            //2. 출력
            System.out.println("==========방문록==========");
            //for문을 이용한 배열 내 모든 항목/요소 호출 : 0부터 2까지 1씩 증가. 나머지는 코드 반복
            for(int index=0; index<내용배열.length; index++){//for start
                //타입은 클래스 이지만 null 비교시 비교연산자 사용
                if(내용배열[index]!=null){//if start
                    System.out.printf("%2d \t %-5s \t %-20s \n",index+1, 작성자배열[index], 내용배열[index]);
                }//if end
            }//for end
            System.out.println("1.방문록 작성 2.방문록 삭제 3.종료");
            //3. 입력
            System.out.print("선택 > ");
            int ch=scanner.nextInt();
            
            //4. 입력에 따른 경우의수 판단
            if(ch==1){
                //6-1. 방명록 작성할 위치(인덱스) 입력받는다.
                System.out.print("방문록 작성 위치 : 1. 2. 3. : ");
                int no=scanner.nextInt();

                //6-2. 입력 : 내용, 작성자, 비밀번호 각각 입력받기.
                scanner.nextLine();
                System.out.print("내용 : ");
                    String content=scanner.nextLine();
                System.out.print("작성자 : ");
                    String writer=scanner.next();
                System.out.print("비밀번호 : ");
                    int password=scanner.nextInt();

                //6-3. 저장
                내용배열[no-1]=content;
                작성자배열[no-1]=writer;
                비밀번호배열[no-1]=password;
            }
            else if(ch==2){
                //입력 : 삭제할 방문록의 위치(인덱스)입력
                System.out.print("방문록 삭제 위치 : 1. 2. 3. : ");
                int no=scanner.nextInt();
                //입력 : 유효성 검사를 위한 비밀번호 입력받기
                System.out.print("방문록 비밀번호 : ");
                int password= scanner.nextInt();
                //8-3. 초기화 : 만약에 인덱스가 없는 번호를 선택했을때
                if(no<1 || no>내용배열.length){
                    System.out.println("[경고] 알수 없는 위치입니다.");
                } //만약에 선택한 방문록의 패스워드와 방금 입력한 패스워드와 같으면
                else if(비밀번호배열[no-1]==password){
                    //배열의 항목/요소의 자리/길이 삭제할 수 없으므로 초기값으로 대입.
                    내용배열[no-1]=null;
                    작성자배열[no-1]=null;
                    비밀번호배열[no-1]=0;
                }
                else{
                    System.out.println("[경고] 패스워드가 다릅니다.");
                }
            }
            else if(ch==3){
                break;
            }
            else{
                System.out.println("[경고] 알수 없는 입력입니다.");
            }
            
        }//while end
        
    }//main end
}//class end
