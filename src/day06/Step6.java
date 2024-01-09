package day06;

import java.util.Scanner;

public class Step6 {//class start
    public static void main(String[] args) {//main start
        //3. 전화번호부 만들기

        Scanner scanner=new Scanner(System.in);
        String 전화번호부 ="";
        int num=1;  //전화번호부 순번

        while(true) {//while start
            //항목 선택
            System.out.print("1.전화번호등록 2.전화번호삭제\n선택 > ");
            int selectC=scanner.nextInt();
            scanner.nextLine();

            if(selectC==1) {//if start

                //전화번호부 입력
                System.out.print("이름을 입력해 주세요. : ");
                전화번호부 +=",\t" + scanner.nextLine() + "\t";
                System.out.print("전화번호를 000-0000-0000 형식으로 입력해 주세요. : ");
                전화번호부 += scanner.nextLine() + "/";
                //System.out.println(전화번호부);

            }
            else if(selectC==2) {

                if(전화번호부.indexOf("/")==-1){
                System.out.println("전화번호 없음");
                continue;            }

                //전화번호부 삭제
                System.out.print("삭제할 전화번호의 순번을 입력해 주세요. : ");
                int delete = scanner.nextInt();

                전화번호부=전화번호부.replace(전화번호부.split("/")[delete-1]+"/","");
                System.out.println("삭제 실행");

            }
            else{
                System.out.println("다시 입력 해 주십시오.");
                continue;
            }//if end

            //전화번호부 출력
            if(전화번호부.indexOf("/")==-1){
                System.out.println("전화번호 없음");
                continue;
            }

            System.out.println("=============전화번호부===============\n순번\t이름\t 전화번호");
            for(int i=0; i<전화번호부.split("/").length;i++){//for start
                System.out.printf("%s%s\n",i+1,전화번호부.split("/")[i].split(",")[1]);
            }//for end

            num++;

        }//while end



    }//main end
}//class end
// 3. step6 전화번호부 만들기 [ 완성되면 카톡방 코드 제출 ]
/*
    [1.조건]
        - 하나의 문자열만 이용하여 여러명의 이름과 전호번호를 관리하시오.
        String 전화번호부 = "";

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>
*/