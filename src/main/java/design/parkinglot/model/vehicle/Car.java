package design.parkinglot.model.vehicle;

import design.parkinglot.constant.VehicleType;

public class Car extends Vehicle {
    public Car(String registrationNumber) {
        super(registrationNumber, VehicleType.CAR);
    }
}
