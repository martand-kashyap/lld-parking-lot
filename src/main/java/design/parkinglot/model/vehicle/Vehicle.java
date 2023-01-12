package design.parkinglot.model.vehicle;

import design.parkinglot.constant.ParkingSpotType;
import design.parkinglot.constant.VehicleType;
import design.parkinglot.model.Ticket;
import lombok.Getter;

public abstract class Vehicle {
    @Getter
    private String registrationNumber;
    @Getter
    private VehicleType type;

    Vehicle(String registrationNumber, VehicleType type) {
        this.registrationNumber = registrationNumber;
        this.type = type;
    }

    public void assignTicket(Ticket ticket) {
        ticket.setVehicle(this);
    }

    public ParkingSpotType getSpotTypeForVehicle(VehicleType type) {
        return switch (type) {
            case CAR -> ParkingSpotType.COMPACT;
            case VAN, TRUCK -> ParkingSpotType.LARGE;
            case MOTORCYCLE -> ParkingSpotType.MOTORCYCLE;
        };
    }
}
