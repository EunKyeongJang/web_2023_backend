package day22;

public class Step2 {
    public static void main(String[] args) {
        //1. product 클래스에 tv타입, String타입 정의.
        Product<Tv, String>product1=new Product<>();
        /* 클래스 선언 시 필드의 타입을 다양하게 사용하기 위해
        - 1.Object>타입변환 필요  2.제네릭
            //product1 객체의 필드 상태
            private Tv kind;
            private String model;
         */

        //2.
        product1.setKind(new Tv()); //해당 kind 필드가 tv타입이므로 tv 객체 대입 가능
        product1.setModel("스마트tv"); //해당 model 필드가 String 타입이므로 string 객체 대입 가능

        //3. 호출
        Tv tv=product1.getKind();
        String tvModel=product1.getModel();
        //---------------------------------
        Product<Car, String> product2=new Product<>();
        /*- product1 객체의 필드 상태
        private Car kind;
        private String model;
         */
        //product2.setKind(new Tv()); : 제네릭에서 정의한 타입이 다르므로 불가능
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car=product2.getKind();
        String carModel=product2.getModel();
    }
}
