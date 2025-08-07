package pattern.behavioural.duck;

public abstract class Duck {
    public void swim() {
        System.out.println("I am swimming!");
    }

    public void quack() {
        System.out.println("I am Swimming");
    }

    public abstract void display();
}
