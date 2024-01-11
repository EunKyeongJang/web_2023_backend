package day08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Step1 {//class start
    public static void main(String[] args) {//main start

        Scanner scanner=new Scanner(System.in);
        붕어빵틀[] 붕어빵트레이=new 붕어빵틀[100];
        //500번지={500번지[101번지], 501번지[null], 502번지[null], ...}
        
        while(true){//while start
            System.out.println(Arrays.toString(붕어빵트레이));//배열 내 주소확인 라이브러리

            for(int i=0; i<붕어빵트레이.length; i++){
                if(붕어빵트레이[i]!=null){
                    System.out.println(i+"인덱스 : "+붕어빵트레이[i].속재료+"\t");
                }
            }

            System.out.print("1.굽기 2.판매 : ");
            int ch=scanner.nextInt();
            
            if(ch==1){

                System.out.print("속재료 : ");
                String 입력속재료=scanner.next();
                
                //1. 객체생성 : 1.new -> 2.클래스/생성자() 호출
                붕어빵틀 붕어빵=new 붕어빵틀();   //(1개의 주소 생성) 붕어빵이 생성됨  
                    //101번지{}
                붕어빵.속재료=입력속재료;
                
                for(int i=0; i<붕어빵트레이.length; i++){
                    //만약에 i 번째 공간이 비어있으면 거기에 붕어빵을 넣어라
                    if(붕어빵트레이[i]==null){
                        붕어빵트레이[i]=붕어빵;
                        break;  //트레이[배열]에 붕어빵 넣었으면 끝
                    }
                }//if가 끝나면 객체를 참조하는 변수는 사라지므로 객체의 참조주소를 옮겨야 한다.
            }//if 가 끝나면 '붕어빵'의 지역변수는 사라짐 -> 곧 객체도 사라짐
            else if(ch==2){
                System.out.print("판매할 붕어빵 위치 :");
                int dNo=scanner.nextInt();

                //-자바는 힙영역에 객체를 제거하는 방법을 제공하지 않는다. 그래서 초기값(null)활용
                붕어빵트레이[dNo]=null;
                //- 만약에 삭제할 객체 인덱스 뒤로 객체가 존재하면 한칸씩 옮기기
                //500번지={500번지[null], 501번지[102번지], 502번지[103번지], ...}
                //500번지={500번지[102번지], 501번지[103번지], 502번지[null], ...}
                for(int i=dNo; i<붕어빵트레이.length; i++){
                    //i는 삭제한 객체의 인덱스 위치부터 마지막 인덱스까지 반복
                    //i+1 : 삭제한 인덱스 뒤
                    if(i+1==붕어빵트레이.length) break;//마지막 인덱스이면 생략
                    붕어빵트레이[i]=붕어빵트레이[i+1];
                }
            }
            
        }//while end
        
    }//main end
}//class end
