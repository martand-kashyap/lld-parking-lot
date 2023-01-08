package design.parkinglot.model.vehicle;

import design.parkinglot.constant.VehicleType;
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
}
