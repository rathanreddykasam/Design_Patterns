package pattern.behavioural.duck;

import pattern.behavioural.duck.behaviors.fly.FlyNoWay;
import pattern.behavioural.duck.behaviors.fly.FlyWithWings;
import pattern.behavioural.duck.behaviors.quack.MuteQuack;
import pattern.behavioural.duck.behaviors.quack.Squeak;

public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        FlyWithWings fw = new FlyWithWings();
        Squeak s = new Squeak();
        md.setQuackBehvavior(s);
        md.setFlyBehavior(fw);
        md.performFly();
        md.performQuack();
        md.display();
        md.swim();

        RubberDuck rd = new RubberDuck();
        FlyNoWay fnw = new FlyNoWay();
        MuteQuack mq = new MuteQuack();

        rd.setFlyBehavior(fnw);
        rd.setQuackBehvavior(mq);
        rd.display();
        rd.performQuack();
        rd.performFly();
    }
}
