package design.parkinglot;

public class ParkingLot {
    private static ParkingLot INSTANCE;

    static {
        INSTANCE = new ParkingLot();
    }

    private ParkingLot() {

    }

    public ParkingLot getInstance() {
        return INSTANCE;
    }
}
