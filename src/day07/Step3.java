package day07;

import java.util.Scanner;

public class Step3 {//class start
    public static void main(String[] args) {//main start

        Scanner scanner = new Scanner(System.in);
        Phone[] phoneBook = new Phone[100];

        //Phone 객체 생성
        for (int i = 0; i < phoneBook.length; i++) {
            phoneBook[i] = new Phone();
        }
        
        while (true) {//while start
            //항목선택
            System.out.println(" 1.전화번호등록 2.전화번호삭제");
            System.out.print("선택 > ");
            int no = scanner.nextInt();
            scanner.nextLine();
    
            if (no == 1) {//if start
                //전화번호 등록
                for(int j=0; j<phoneBook.length; j++){
                    if(phoneBook[j].name==null && phoneBook[j].PhoneNum==null){
                        System.out.print("이름을 입력하세요 : ");
                        phoneBook[j].name = scanner.nextLine();
                        System.out.print("전화번호를 입력하세요 : ");
                        phoneBook[j].PhoneNum = scanner.nextLine();
                        break;
                    }
                }
            }
            else if (no == 2) {
                //전화번호 삭제
                System.out.println("삭제할 전화번호의 순번을 입력하세요 : ");
                int deleteNum=scanner.nextInt();

                for(int i=deleteNum; i<phoneBook.length; i++){//for start
                    phoneBook[i-1].name= phoneBook[i].name;
                    phoneBook[i-1].PhoneNum= phoneBook[i].PhoneNum;
                }//for end
            }
            else{
                System.out.println("다시 입력해 주십시오.");
                continue;
            }//if end
            //출력
            System.out.println("============= 전화번호부 =============");
            System.out.println("순번     이름      전화번호");
            for(int i=0; i<phoneBook.length; i++){//for start
                if(phoneBook[i].name!=null&&phoneBook[i].PhoneNum!=null) {//if start
                    System.out.printf("%d\t\t%-5s  %-10s\n", i+1, phoneBook[i].name, phoneBook[i].PhoneNum);
                }//if end
            }//for end
        }//while end


    }//main end
}//class end

//<클래스>
        /*
        package day07;

        public class Phone {

            String name;
            String PhoneNum;

        }*/


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
/*
//여러개 자료를 관리하는 방법
            //이름이 '유재석'이고 전화번호가 '010-3333-3333' 이고 나이'53' 일때
        //1. 변수
        String 이름="유재석";
        String 전화번호="010-3333-3333";
        int 나이=53;
        //주의할점 : 인원이 증가하면 그 인원수 만큼의 X3 변수 필요

        //2. 배열
        String[] 이름명단={"유재석"};
        String[] 전화번호명단={"010-3333-3333"};
        int[] 나이명단={53};
            //주의할점 : 동일한 타입의 데이터들만 나열
        String[] 명단={
                "유재석", "010-3333-3333", "53",
                "강호동", "010-4444-4444", "70"
        };//인덱스 관리가 힘들어짐

        //3. 문자열
        String 인원="유재석,010-3333-3333,53";
        String[] 인원명단={인원,인원};
        //vs 여러개의 자료들을 하나의 문자열로 합치기 [ !!! : 구분자 ]
        String 인원명단="유재석,010-3333-3333,53\n강호동,010-4444-4444,70";
            //1. 사람구분 : \n
            //2. 사람마다의 정보 : ,

        //4. 클래스 / 객체
        //서로 다른 타입들을 하나의 타입 묶음
 */