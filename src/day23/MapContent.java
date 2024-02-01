package day23;

public class MapContent<K,V>{
    //필드
    K key;
    V value;

    //생성자
    public MapContent(){}
    public MapContent(K key, V value) {
        this.key = key;
        this.value = value;
    }

    //getter/setter
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
