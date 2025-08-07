package pattern.behavioural.duck.behaviors.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings!");
    }
}
