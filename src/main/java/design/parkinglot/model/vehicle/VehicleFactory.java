package design.parkinglot.model.vehicle;

import design.parkinglot.constant.VehicleType;
import design.parkinglot.exception.VehicleNotSupportedException;

public class VehicleFactory {
    public static Vehicle getVehicleInstance(String registrationNumber, VehicleType type) throws VehicleNotSupportedException {
        return switch (type) {
            case CAR -> new Car(registrationNumber);
            case MOTORCYCLE -> new Motorcycle(registrationNumber);
            case TRUCK -> new Truck(registrationNumber);
            case VAN -> new Van(registrationNumber);
            default -> throw new VehicleNotSupportedException();
        };
    }
}
