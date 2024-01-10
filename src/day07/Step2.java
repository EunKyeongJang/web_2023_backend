package day07;

//===============클래스의 용도 : 2. 실행 클래스=================
//>>class라는 설계도를 main(스레드)로 읽어서 메모리가 생성되는 개념
public class Step2 {//class start

    public static void main(String[] args) {//main start

        //p.215
        //1. 객체 생성
            //1. new
        //new

            //2. 생성자/클래스명
        //new 생성자/클래스명();

            //3. 변수 선언
        //Car car;
            //+
        Car myCar=new Car();

        //. : 접근연산자 : 변수가 가지고있는 주소의 객체 접근
        System.out.println("모델명 : "+myCar.model);
        System.out.println("시동여부 : "+myCar.start);
        System.out.println("현재속도 : "+myCar.speed);

        Car yourCar=new Car();

        //. : 접근연산자 : 변수가 가지고있는 주소의 객체 접근
        System.out.println("모델명 : "+yourCar.model);
        System.out.println("시동여부 : "+yourCar.start);
        System.out.println("현재속도 : "+yourCar.speed);

        //p.217
        //*필드는 데이터이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
        //1. 객체 생성
        Car2 myCar2=new Car2();

        System.out.println("제작회사 : "+myCar2.company);//현대자동차/ yourCar2.company와 힙이 다르다.
        System.out.println("제작회사 : "+myCar2.model);
        System.out.println("제작회사 : "+myCar2.color);
        System.out.println("제작회사 : "+myCar2.maxSpeed);
        System.out.println("제작회사 : "+myCar2.speed);
        
            //3. 객체 내 필드의 값 수정
        myCar2.speed=60;
        System.out.println("현재속도 = " + myCar2.speed);
        
        //===============
        
        Car2 yourCar2=new Car2();
        System.out.println("제작회사 : "+yourCar2.company);//현대자동차/ myCar2.company와 힙이 다르다.

    }//main end
}//class end
