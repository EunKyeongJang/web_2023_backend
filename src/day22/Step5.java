package day22;

public class Step5 {
    public static void main(String[] args) {

        //Applicant<T>
            //왜 T? 응모자의 타입을 여러개 할려고
            //1. Object
            //2. 제네릭
        /*
            Applicant<Person> applicant1;
            applicant1{
                public Person kind=person1;
            }
            ----------------------------------------
            new Applicant <Worker>{

            }
         */

        //1. 모든사람이 신청 가능
            //1. 사람객체
        Person person=new Person();
            //2. 사람객체를 등록자1에 대입.
        Applicant<Person> applicant1=new Applicant<>(person);
        //1.
        Course.registerCourse1(applicant1);

        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighSchool>(new HighSchool()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        //2.
        //Course.registerCourse2(new Applicant<Person>(new Person()));
        //Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighSchool>(new HighSchool()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        //3.
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Student>(new Student()));
        //Course.registerCourse3(new Applicant<HighSchool>(new HighSchool()));
        //Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

        //예외 : 예외클래스 라이브러리 지원(라이브러리에 없는 오류는 지원 x)
            //1. 일반예외 : 컴파일전에 예외검사 -> (라이브러리에 없는 오류는 지원 x) 예외를 직접 만들어야한다.
            //2. 실행예외 : 컴파일 후에 예외검사

        //예외 vs 흐름검사
            //값/데이터에 따른 검사 : if  vs  데이터(경우의수가 특정하지 않을때), 미리 만들어진 라이브러리 : try catch
    }//m end
}//c end
