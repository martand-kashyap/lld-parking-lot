package design.parkinglot.model.parkingspot;

import design.parkinglot.constant.ParkingSpotType;
import design.parkinglot.model.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

public abstract class ParkingSpot {
    @Getter
    private ParkingSpotType parkingSpotType;
    @Getter
    @Setter
    private boolean isFree;
    @Getter
    @Setter
    private Vehicle parkedVehicle;

    ParkingSpot(ParkingSpotType type) {
        this.parkingSpotType = type;
        this.isFree = true;
        parkedVehicle = null;
    }
}
