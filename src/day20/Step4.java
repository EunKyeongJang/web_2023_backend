package day20;

public class Step4 {
    //1. 매개변수 문자의 길이를 알려주는 함수
    public static void printLength(String data){
        //------- 예외가 발생할 것 같은 코드 --------//
        try {
            int result = data.length();           //.(도트) : 참조객체로 인스턴스 멤버 호출
            System.out.println("문자 수 : " + result);
        }
        //--------------------------------------//
        //------- 만약에 try 안에서 예외 발생 시--------//
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();
        }
        //------------------------------------------//
        finally {
            System.out.println("[마무리 실행]");
        }
    }
    public static void main(String[] args) {

        //1. [실행예외 - 컴파일 시 예외 검사안함] NullPointerException
        printLength("ThisIsJAVA");
        printLength(null);  //null이면 참조가 없으므로 .(도트) 불가능

        //2. [일반예외 - 컴파일 시 예외 검사진행] ClassNotFoundException
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        }
        catch (ClassNotFoundException e){
            //e.printStackTrace();
        }
        System.out.println("프로그램 종료");

        //3.
        String[] array={"100", "1oo"};
        for(int i=0; i<=array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);//"1oo"는 정수타입으로 변환 불가능
            }
            catch (NullPointerException | NumberFormatException e){
                System.out.println(i+"숫자로 변활할 수 없습니다."+e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(i+"배열 인덱스가 초과됨"+e.getMessage());
            }//c end
            System.out.println("상위 예외클래스");
        }//f end
    }//m end
}//c end
