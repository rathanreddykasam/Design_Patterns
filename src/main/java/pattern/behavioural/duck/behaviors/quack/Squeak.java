package pattern.behavioural.duck.behaviors.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I make squeak sound");
    }
}
