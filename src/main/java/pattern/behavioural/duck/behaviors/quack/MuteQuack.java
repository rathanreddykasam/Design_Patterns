package pattern.behavioural.duck.behaviors.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("I don't make any sounds.");
    }
}
