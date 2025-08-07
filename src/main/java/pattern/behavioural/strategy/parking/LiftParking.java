package pattern.behavioural.strategy.parking;

public class LiftParking implements Parking{
    @Override
    public void create() {
        System.out.println("Parking near to Lift");
    }
}
