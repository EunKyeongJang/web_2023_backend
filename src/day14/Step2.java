package day14;

public class Step2 {
    public static void main(String[] args) {
        //1. 자식객체 생성
        Child child=new Child();

        //2. 자식객체의 타입을 부모타입으로 변환(자동타입변환)
        Parent parent=child;

            //*자식객체가 부모타입으로 변환 시 자식타입의 필드/메소드를 사용할 수 없다.
                //>>그래서 다시 부모타입 -> 자식타입(강제타입변환) 을 사용
            //단, 오버라이딩 된 메소드는 부모타입이 아닌 자식타입의 메소드을 우선으로 한다.

        //3. 메소드 호출
        parent.method1();
        parent.method2();

        //부모객체 3개 만들어서 배열 저장
        Parent[] parents=new Parent[3];
        for(int i=0; i<3; i++){
            parents[i]=new Parent();
        }

        //자식객체 3개 만들어서 배열 저장
        Child[] children=new Child[3];
        for(int i=0; i<3; i++){
            children[i]=new Child();
        }

        //+부모객체+자식객체 저장하는 배열
        Parent[] parents1=new Parent[6];
        for(int i=0; i<6; i++){
            parents1[i]=new Parent();
        }
        for(int i=3; i<6; i++){
            parents1[i]=new Child();
        }

        //p.311~312 4.
        System.out.println(parent.field1);
            //부모타입에서 자식타입의 필드/메소드 사용 불가
        //System.out.println(parent.field2);
        
        //5. 강제 타입변환
        Child child1=(Child)parent;
        System.out.println(child1.field1);
            //자식 타입에서 부모 타입의 필드/메소드 사용 가능
        System.out.println(child1.field2);
    }//m end
}//c end
