package design.parkinglot.model.parkingspot;

import design.parkinglot.constant.ParkingSpotType;
import design.parkinglot.constant.VehicleType;

public class ParkingSpotFactory {
    public static ParkingSpot getParkingSpotInstance(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new Compact();
            case TRUCK, VAN -> new Large();
            case MOTORCYCLE -> new Motorcycle();
        };
    }

    public static ParkingSpot getParkingSpotInstance(ParkingSpotType parkingSpotType) {
        return switch (parkingSpotType) {
            case COMPACT -> new Compact();
            case HANDICAPPED -> new Handicapped();
            case MOTORCYCLE -> new Motorcycle();
            case LARGE -> new Large();
        };
    }
}
