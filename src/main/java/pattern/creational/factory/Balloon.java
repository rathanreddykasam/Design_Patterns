package pattern.creational.factory;

public class Balloon {
    public Factory createBalloon;

    public Balloon() {
        createBalloon = new RedBalloon();
    }

    public void setBalloonStrategy(Factory f) {
        createBalloon = f;
    }

    public void create() {
        createBalloon.create();
    }

}
