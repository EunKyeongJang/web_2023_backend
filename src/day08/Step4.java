package day08;

import java.util.Scanner;

public class Step4 {//class start
    public static void main(String[] args) {//main start

        Scanner scanner=new Scanner(System.in);

        //1. Phone 객체 100기를 저장할 수 있는 Phone qoduf tjsdjs
        //등록전 : null X 100
        Phone[] phoneBook=new Phone[3];

        while(true){//while start

            for(int i=0; i<phoneBook.length; i++){
                if(phoneBook[i]!=null){
                    System.out.printf("%3d \t%5s \t%12s \n",(i+1), phoneBook[i].name, phoneBook[i].number);
                }
            }

            System.out.print("1.등록 2.삭제 선택>");
            int ch=scanner.nextInt();
            if(ch==1){
                //1. 입력받기
                System.out.println("이름 : ");
                String name=scanner.next();
                System.out.println("전화번호 : ");
                String number=scanner.next();

                //2. 객체 생성 한다. [생성자 선택]
                /*    //1. 기본생성자 사용시
                Phone newPhone=new Phone();
                newPhone.name=name;
                newPhone.number=number;*/

                      //2. 정의생성자 사용시
                Phone newPhone=new Phone(name, number);
                
                //3. phoneBook 배열 내 빈 공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i=0; i<phoneBook.length; i++){
                    if(phoneBook[i]==null){
                        phoneBook[i]=newPhone;
                        break;  //빈 공간을 찾아서 대입은 1번만! 대입했으면 반복 종료
                    }
                }
            }
            if(ch==2){
                System.out.print("삭제할 순번 : ");
                int dNo=scanner.nextInt();

                phoneBook[dNo-1]=null;

                for(int i=dNo-1;i<phoneBook.length; i++){
                    if(i+1==phoneBook.length){
                        break;
                    }
                    phoneBook[i]=phoneBook[i+1];//한칸씩 당기기
                }
            }

        }//while end

    }//main end
}//class end
/*
    메모리 구성
        이름과 전화번호를 여러개 저장
        - 예) '유재석' '010-2111-1111' '강호동' '010-5555-5555'

        1. 변수 : 여러개 변수를 만들어서 여러명 관리[만일 100명 힘들어]
            String 이름1="유재석"      String 전화번호1="010-2111-1111"
            String 이름2="강호동"      String 전화번호2="010-5555-5555"
            
        2. 배열 : 동일한 타입으리 자료형을 순서(인덱스)대로 나열
            1. String[] 이름들={"유재석", "강호동"}
               String[] 전화번호들={"010-2111-1111", "010-5555-5555"}
               vs
            2. String 전화번호부={"유재석", "010-2111-1111", "강호동", "010-5555-5555"}
            
        3. 문자열 : 모든 데이터를 문자형식으로 해서 하나의 문자열 저장
            //- 구분자 : 
            String 전화번호부="유재석,010-2111-1111\n강호동,010-5555-5555";
            
        4. **객체 : 클래스 [미리 특 잡기]/설계 기반으로 생성된 메모리
            - 필드를 이용한 데이터를 구분
            - 생성자를 이용한 초기화 할 수 있다.
            - 메소드를 이용한 행위/이벤트 할 수 있다.

            //1. 틀 만들기 [클래스 만들기]
            class Phone{    // : 전화번호 1개에 대한 설계 -> new 여러번 -> 전화번호 여러개 -> 배열에 저장(Phone[] phone=new Phone();)
                멤버 : 필드(객체의 데이터를 저장하는 공간), 생성자, 메소드
            }
            //2. 틀 기준으로 메모리 생성 [객체 만들기]
            new Phone();
 */
/*
    [1.조건]
        - 하나의 클래스(Phone)를 설계해서 여러개의 객체 생성하고 관리하시오.
        - 설계한 클래스(Phone)를 이용하여 배열(phoneBook)을 하나만 선언합니다. 단 배열에 최대 100개의 객체만 저장할수 있습니다.
        Phone[] phoneBook = new Phone[100];

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 객체 생성후 배열에 순서대로 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
            - 삭제된 객체 뒤 로 객체가 있을경우 한칸씩 앞으로 이동하시오.
                예)
                    0(객체A) 1(객체B) 2(객체C) 3(객체D)  4(null)
                        만일 2번 인덱스의 객체 삭제시
                    0(객체A) 1(객체B) 2(객체D) 3(null)   4(null)
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력
            - 단 배열 항목/요소내 객체가 없을경우에만 출력하지 마시오.

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>
*/
