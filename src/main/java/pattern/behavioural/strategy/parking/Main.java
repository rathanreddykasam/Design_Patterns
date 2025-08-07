package pattern.behavioural.strategy.parking;

public class Main {
    public static void main(String[] args){
        System.out.println("-----------Parking design Pattern------------------");
        ParkingStrategy p = new ParkingStrategy();
        p.create();

        GateParking l = new GateParking();
        p.setParkingStrategy(l);
        p.create();
    }
}
