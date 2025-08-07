package pattern.behavioural.duck.behaviors.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am rocket Powered!");
    }
}
