package day01;//패키지명

public class Step3 {//class start
    public static void main(String[] args) {//main 함수 start
        //[p.41] 진수 표현하는 방법
        int var1=0b1011;    //2진수 : 데이터 앞에 0b(2진수라는 표시) 1011[2] -> 11[10]
            System.out.println("var1 : "+var1);

        int var2=0206;  //8진수 : 데이터 앞에 0(8진수라는 표시) 206[8] -> 134[10]
            System.out.println("var2 : "+var2);

        int var3=365;
            System.out.println("var3 : "+var3);

        int var4=0xB3;  //16진수 : 데이터 앞에 0x(16진수라는 표시) B3[16] -> 179[10]
            System.out.println("var4 : "+var4);

        //[p.42] byte type [-128 ~ 127] : 1byte => 8bit -> 1[부호]+7[값] ->2^7
        byte b1=-128;        System.out.println("b1 : "+b1);
        byte b2=127;        System.out.println("b2 : "+b2);
        //byte b3=200;        System.out.println("b3 : "+b3); //혀용범위 벗어남
            //java: incompatible types: possible lossy conversion from int to byte

        //short type [-32768 ~ 32767] : 2byte => 16bit
        short s1=32000;        System.out.println("s1 : "+s1);
        //short s2=50000;        System.out.println("s2 : "+s2);  //허용범위 벗어남
            //java: incompatible types: possible lossy conversion from int to short

        //*int type [+-21억 정도] : 4byte : !!! : 정수타입 리터럴(그 값 자체)
        int i1=2000000000;        System.out.println("i1 : "+i1);
        //int i2=3000000000;        System.out.println("i2 : "+i2);   //허용범위 벗어남
            //java: integer number too large

        //long type[+-21억 이상] : 8byte : !!! : 정수타입 리터럴 뒤에 l/L
        long l1=3000000000l;        System.out.println("l1 : "+l1);

        //[p.43] char[0 ~ 65535] : 2바이트 : !!! : '작은따옴표' , 65536개 문자 표현 가능, 부호[signed]/부호없음[unsigned]
        char c1='A';        System.out.println("c1 : "+c1);
        char c2='가';        System.out.println("c2 : "+c2);
        //char c3="A";        System.out.println("c3 : "+c3); //오류=>char 자료에 쌍따옴표 안됨
            //java: incompatible types: java.lang.String cannot be converted to char

            //1. char 왜 정수형타입 가능한지 : 유니코드가 10진수 사용 가능하기 때문
        int i3='A';        System.out.println("i3 : "+i3);  //65
        int i4='가';        System.out.println("i4 : "+i4);  //44032
        char c4=80;        System.out.println("c4 : "+c4);  //P

        //[p.49] String : "큰따옴표", 참조자료형/클래스
        String str1="안녕하세요";                       System.out.println("str1 : "+str1);
        String str2="나는 \"자바\"를 배웁니다.";         System.out.println("str2 :"+str2);
        String str3="번호\t이름\t직업";              System.out.println("str3 :"+str3);

        //java/jdk 13 이후 가능한 문법
        String str4= """
                        나는 자바를 
                        학습합니다. 나는 
                        자바 고수가 될겁니다.
                        """;
            System.out.println("str4 : "+str4);

        //[p.45]float[소수점 8자리까지 표현] : 4바이트 : 반올림
        float f1=0.123456789123456789f;        System.out.println("f1 : "+f1);
        //double[소수점 17자리까지 표현] : 8바이트 : 실수타입의 기본타입
        double d1=0.123456789123456789;        System.out.println("d1 : "+d1);
        //boolean

        //[p.43] boolean [true or false] : 1bit
        boolean bool1=true;
        //boolean bool2=1;    //오류 : 1은 int이므로 boolean에 저장할 수 없음 [정수의 최소단위가 byte]
        //System.out.println(bool1+1);  //오류 : 위와동일
        //int intVal=1;        if(intval)   //오류 : 위와동일
        

    }//main end
}//class end
