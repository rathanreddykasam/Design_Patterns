package pattern.strategy.factory;

public class YellowBalloon implements Factory{
    @Override
    public void create() {
        System.out.println("Creating Yellow Balloon!");
    }
}
