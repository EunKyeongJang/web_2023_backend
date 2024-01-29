package day20;

public class Step2 {
    public static void main(String[] args) {
        RemoteControl2 rc=new SmartTelevision();
        
        rc.turnOn();
        rc.turnOff();
        
        Searchable searchable=new SmartTelevision();
        
        //searchable.turnOn();
        //searchable.turnOff();
        searchable.search("검색");
    }//m end
}//c end
