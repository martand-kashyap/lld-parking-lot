package design.parkinglot.model.vehicle;

import design.parkinglot.constant.VehicleType;

public class Van extends Vehicle {
    Van(String registrationNumber) {
        super(registrationNumber, VehicleType.VAN);
    }
}
