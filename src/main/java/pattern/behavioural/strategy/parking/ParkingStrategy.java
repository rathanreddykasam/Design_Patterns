package pattern.behavioural.strategy.parking;

public class ParkingStrategy {

    public Parking createParking;

    public ParkingStrategy() {
        createParking = new LiftParking();
    }

    public void setParkingStrategy(Parking p) {
        createParking = p;
    }

    public void create(){
        createParking.create();
    }

}
