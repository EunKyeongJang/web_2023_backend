package day22;

public class HomeAgency implements Rantable<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}
