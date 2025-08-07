package pattern.creational.factory;

public class Main {
    public static void main(String[] args) {
        Balloon b = new Balloon();
        b.create();
        YellowBalloon y = new YellowBalloon();
        b.setBalloonStrategy(y);
        b.create();
    }
}
