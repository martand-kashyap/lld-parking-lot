package design.parkinglot.model.parkingspot;

import design.parkinglot.ParkingLot;
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

    public void parkVehicle(Vehicle vehicleToPark) {
        this.parkedVehicle = vehicleToPark;
        this.isFree = false;
    }

    public void unpark() {
        ParkingLot lot = ParkingLot.getInstance();
        if (isFree) {
            //spot is already empty
            return;
        }
        //lot.getParkingSpots().get(this.parkingSpotType).add(this);

        this.parkedVehicle = null;
        this.isFree = true;
    }
}
