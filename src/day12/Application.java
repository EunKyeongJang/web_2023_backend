package day12;

import day12.view.MainView;

//실행클래스 :
public class Application {//class start
    //화면구현(입출력)
    public static void main(String[] args) {//main start
        //다른클래스의 메소드를 호출하는 방법
        //1. 해당 메소드가 인스턴스 메소드일 경우
        //new MainView().run();
        //2. 해당 메소드가 인스턴스 메소드일 경우
        //MainView mainView=new MainView();
        //mainView.run();
        //3. 해당 메소드가 static일 경우
        //MainView.run();
        //4. 싱글톤
        MainView.getInstance().run();
    }//main end
}//class end
/*
소프트웨어 개발시 사용되는 디자인 패턴 MVC
    MVC : 사용자 인터페이스, 데이터 및 논리제어 구현하는데 있어 사용되는 패턴
    - 관심사 분리해서 (*)업무의 분리와 향상된 관리
    M : model   : JAVA, DB          : 데이터 객체
        - DTO객체 : 데이터 접근 객체(DARA Access Object)
        - DTO객체 : 서로다른 레이어/계층에 이동하는 객체(DATA Transfer Object) 이동객체
        - VO : 불변 데이터 객체/ 수정금지(setter 없다.)
    V : view    : HTML, CSS, JS     : (입출력) 구현
    C : control : JAVA, node.JS     : model과 view 중계역할하고 제어
        - controller : 제어, 유효성검사
        - service    : 비지니스 로직(주요기능 로직)
    
        JSP(JAVA*HTML)
        REACT(JS*HTML)

        사용자(view) ----요청(DTO,JSON)---> controller ----DTO----> DAO------> DATABASE
        HTML,JS                             JAVA                  JAVA


 */
