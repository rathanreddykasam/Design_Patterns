package pattern.behavioural.strategy.parking;

public class GateParking implements Parking{
    @Override
    public void create() {
        System.out.println("Parking near to Gate");
    }
}
