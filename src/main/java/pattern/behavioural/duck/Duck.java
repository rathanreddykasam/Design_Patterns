package pattern.behavioural.duck;

import pattern.behavioural.duck.behaviors.fly.FlyBehavior;
import pattern.behavioural.duck.behaviors.fly.FlyWithWings;
import pattern.behavioural.duck.behaviors.quack.Quack;
import pattern.behavioural.duck.behaviors.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior fb;
    QuackBehavior qb;
    public void Duck() {
        fb = new FlyWithWings();
        qb = new Quack();
    }

    public void setFlyBehavior(FlyBehavior f) {
        fb = f;
    }

    public void setQuackBehvavior(QuackBehavior q) {
        qb = q;
    }

    public void swim() {
        System.out.println("I can Swim!");
    }

    public void performQuack() {
        qb.quack();
    }

    public void performFly() {
        fb.fly();
    }

    public abstract void display();
}
