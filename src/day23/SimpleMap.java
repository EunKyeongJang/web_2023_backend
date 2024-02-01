package day23;

public class SimpleMap<K,V>{
    //MapContent 객체를 담을 배열 생성
    private MapContent[] array;
    private int size;

    //생성자
    public SimpleMap(){
        array=new MapContent[0];
    }

    public boolean put(K key, V value){
        //중복검사
        for(int z=0; z<this.array.length; z++) {
            //동일 key 존재 시 false 후 끝
            if (key.equals(this.array[z].getKey())){
                System.out.println("put 실행 실패");
                return false;
            }
        }

        //put 실행
        MapContent<K,V> mapContent=new MapContent<>();
        mapContent.setKey(key);
        mapContent.setValue(value);

        this.size++;
        MapContent[] newArray = new MapContent[size];

        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;

        array[this.size - 1] = mapContent;
        return false;
    }

    public String get(K key){
        String result;
        for(int i=0; i<array.length; i++){
            if(array[i].getKey().equals(key)){
                result= String.valueOf(array[i].getValue());
                return result;
            }
        }
        return "get 실행 실패";
    }

    //삭제
    public boolean remove(int index){

        //1. 배열의 사이즈 감소
        this.size--;
        //2. 감소된 사이즈만큼 배열 재할당
        MapContent[] newArray = new MapContent[size];
        //3. 배열복사
        //i : 기존배열 인덱스  //j : 새로운 배열 인덱스
        int j = 0;
        for (int i = 0; i < this.array.length; i++) {
            newArray[j] = array[i];
            //삭제 : 삭제할 인덱스를 빼고 카피
            //만약에 삭제할 인덱스(매개변수)가 아니면
            if (i != index) {
                j++;
            }
            if(index==size && index==j){
                break;
            }
        }
        //4. 기존배열필드에 새로운배열 대입
        array = newArray;
        return true;
    }

    //4. 현재 길이를 출력하는 메소드
    public int size(){
        return this.size;
    }

    //전체출력
    public String toString() {
        String str="{";
        for(int i=0;i<this.array.length; i++){
            //각 인덱스의 값을 str 에 대입
            str+=array[i].getKey().toString();
            str+=":";
            str+=array[i].getValue().toString();
            //마지막 인덱스가 아니면 뒤에 , 추가
            str+=i!=this.array.length-1 ? "," : "";
        }
        str+="}";
        return str;
    }

}// c end
