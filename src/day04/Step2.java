package day04;

public class Step2 {//class start
    public static void main(String[] args) {//main start

        //1. 1 ~ 10 까지 출력하는 코드
        System.out.println(1+"");
        System.out.println(2+"");
        System.out.println(3+"");
        System.out.println(4+"");
        System.out.println(5+"");
        System.out.println(6+"");
        System.out.println(7+"");
        System.out.println(8+"");
        System.out.println(9+"");
        System.out.println(10+"");
        //for 변환
        for(int i=1; i<=10; i++){//for start
            System.out.println(i+"");
        }//for end
        
        //2. 1 ~ 100 까지 합
        int sum=0;//누적합계 구하려고, for 문 밖에서도 사용하기 위해
        int i=1;
        for(i=1; i<=100; i++){//for start
            sum+=i;
        }//for end
        System.out.println("sum = " + sum);
        System.out.println("1~"+(i-1)+"합"+sum);

        //3. 구구단 : 중첩for문 : for 2개 중 (행, 열)
        for(int 단=2; 단<=9; 단++){    //for start
            for(int 곱=1; 곱<=9; 곱++){
                //System.out.print("열/곱"+곱);
                //System.out.print(단+"X"+곱+"="+(단*곱));
                System.out.printf("%3d X %-3d = %-3d",단,곱,단*곱);
            }
            //System.out.println("행/단"+단);
            System.out.println();
        }//for end

        //4. for -> while 1~10까지
        int j=1;
        while(j<=10){//while start
            System.out.println(j+"");
            j++;
        }//while end

        //5. (2)for -> while 1~100까지 누적합계
        int sum2=0;
        int m=1;
        while(m<=100){
            sum2+=m;
            m++;
        }
        System.out.println("m1~"+(m-1)+"합 : "+sum2);


    }//main end
}//class end
