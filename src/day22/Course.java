package day22;

public class Course {
    //[Person클래스 참고]
    //1. 모든사람이면 등록 가능     : ?
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이/가 Course1 등록함");
    }
    //.getClass().getSimpleName() : 객체의 클래스명 호출

    //2. 학생만 등록 가능          : ? extends Student : 본인타입 포함 하위타입 가능.
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이/가 Course2 등록함");
    }

    //3. 직장인 및 일반인 등록 가능  : ? super Worker    : 본인타입 포함 상위타입 가능(형제 불가능)
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이/가 Course3 등록함");
    }
}
