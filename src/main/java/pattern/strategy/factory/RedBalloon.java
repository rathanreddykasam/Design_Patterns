package pattern.strategy.factory;

public class RedBalloon implements Factory{
    @Override
    public void create(){
        System.out.println("Creating Red Balloon!");
    }
}
