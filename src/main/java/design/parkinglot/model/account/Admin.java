package design.parkinglot.model.account;

import design.parkinglot.ParkingLot;
import design.parkinglot.common.Person;
import design.parkinglot.constant.ParkingSpotType;
import design.parkinglot.model.DisplayBoard;
import design.parkinglot.model.Entrance;
import design.parkinglot.model.Exit;
import design.parkinglot.model.ParkingRate;
import design.parkinglot.model.parkingspot.ParkingSpot;
import design.parkinglot.model.parkingspot.ParkingSpotFactory;

public class Admin extends Account {
    public Admin(String username, String password, Person person) {
        super(username, password, person);
    }

    @Override
    public void resetPassword() {

    }

    @Override
    public void addParkingSpot(ParkingSpotType type) {
        ParkingSpot newSpot = ParkingSpotFactory.getParkingSpotInstance(type);
        ParkingLot lot = ParkingLot.getInstance();
        lot.getParkingSpots().get(type).add(newSpot);
    }

    @Override
    public void addEntrance(String name, Entrance entrance) {
        ParkingLot lot = ParkingLot.getInstance();
        if (!lot.getEntrances().containsKey(name)) {
            lot.getEntrances().put(name, entrance);
        }
    }

    @Override
    public void addExit(String name, Exit exit) {
        ParkingLot lot = ParkingLot.getInstance();
        if (!lot.getExits().containsKey(name)) {
            lot.getExits().put(name, exit);
        }
    }

    @Override
    public void addDisplayBoard(DisplayBoard board) {
        ParkingLot lot = ParkingLot.getInstance();
        if (lot.getDisplayBoard() == null) {
            lot.setDisplayBoard(board);
        }
    }

    @Override
    public void updateParkingRate(ParkingRate rate) {
        ParkingLot lot = ParkingLot.getInstance();
        if (lot.getParkingRate() != null) {
            lot.setParkingRate(rate);
        }
    }
}
