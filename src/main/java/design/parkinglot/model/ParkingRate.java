package design.parkinglot.model;

import lombok.Value;

@Value
public class ParkingRate {
    //private ParkingSpotType spotType;
    private int hour;
    private double rate;
}
