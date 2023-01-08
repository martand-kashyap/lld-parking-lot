package design.parkinglot.model.vehicle;

import design.parkinglot.constant.VehicleType;

public class Truck extends Vehicle {
    Truck(String registrationNumber) {
        super(registrationNumber, VehicleType.TRUCK);
    }
}
