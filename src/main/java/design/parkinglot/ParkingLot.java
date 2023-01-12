package design.parkinglot;

import design.parkinglot.constant.ParkingSpotType;
import design.parkinglot.model.*;
import design.parkinglot.model.parkingspot.ParkingSpot;
import design.parkinglot.model.vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@ToString
public class ParkingLot {
    @Getter
    @Setter
    private ParkingRate parkingRate;
    @Getter
    private Map<String, Entrance> entrances;
    @Getter
    private Map<String, Exit> exits;
    @Getter
    @Setter
    private DisplayBoard displayBoard;
    @Getter
    private Map<ParkingSpotType, LinkedList<ParkingSpot>> parkingSpots;
    @Getter
    private Map<String, Ticket> tickets;
    private static ParkingLot INSTANCE;

    static {
        INSTANCE = new ParkingLot();
    }

    private ParkingLot() {
        entrances = new HashMap<>();
        exits = new HashMap<>();
        tickets = new HashMap<>();

        displayBoard = null;
        parkingRate = null;

        parkingSpots = new HashMap<>();
        parkingSpots.put(ParkingSpotType.COMPACT, new LinkedList<>());
        parkingSpots.put(ParkingSpotType.HANDICAPPED, new LinkedList<>());
        parkingSpots.put(ParkingSpotType.LARGE, new LinkedList<>());
        parkingSpots.put(ParkingSpotType.MOTORCYCLE, new LinkedList<>());
    }

    public static ParkingLot getInstance() {
        return INSTANCE;
    }

    public boolean isParkingFull() {
        return false;
    }

    public ParkingSpot findAvailableSpotForVehicle(Vehicle vehicle) {
        if (isParkingFull()) {
            return null;
        }
        ParkingSpotType spotType = vehicle.getSpotTypeForVehicle(vehicle.getType());
        ParkingSpot spot = this.parkingSpots.get(spotType).poll();
        return spot;
    }
}
