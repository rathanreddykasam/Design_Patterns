package pattern.strategy.factory;

public class Balloon {
    public Factory createBalloon;

    public Balloon() {
        createBalloon = new RedBalloon();
    }

    public void BalloonStrategy(Factory f) {
        createBalloon = f;
    }

    public void create() {
        createBalloon.create();
    }

}
