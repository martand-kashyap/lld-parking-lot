package design.parkinglot.model;

import design.parkinglot.ParkingLot;
import design.parkinglot.constant.ParkingSpotType;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DisplayBoard {
    @Getter
    private String id;
    @Getter
    private Map<ParkingSpotType, Integer> availableSpotCount;

    public DisplayBoard() {
        id = UUID.randomUUID().toString();

        availableSpotCount = new HashMap<>();
        availableSpotCount.put(ParkingSpotType.COMPACT, 10);
        availableSpotCount.put(ParkingSpotType.HANDICAPPED, 10);
        availableSpotCount.put(ParkingSpotType.LARGE, 10);
        availableSpotCount.put(ParkingSpotType.MOTORCYCLE, 10);
    }

    public String displayAvailableSpots() {
        return availableSpotCount.toString();
    }
}
