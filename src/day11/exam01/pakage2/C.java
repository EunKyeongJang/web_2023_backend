package day11.exam01.pakage2;

import day11.exam01.pakage1.B;

public class C {
    //다른 패키지 내 (default)(public) 클래스
    //A a;    //오류발생 : default 클래스는 다른 패키지에서 사용 불가
    B b;    //public 클래스는 다른 패키지에서 사용 가능
}
