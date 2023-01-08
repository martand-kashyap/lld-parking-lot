package design.parkinglot.model.vehicle;

import design.parkinglot.constant.VehicleType;

public class Motorcycle extends Vehicle {
    Motorcycle(String registrationNumber) {
        super(registrationNumber, VehicleType.MOTORCYCLE);
    }
}
