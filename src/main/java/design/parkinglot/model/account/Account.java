package design.parkinglot.model.account;

import design.parkinglot.ParkingLot;
import design.parkinglot.common.Person;
import design.parkinglot.constant.AccountStatus;
import design.parkinglot.constant.ParkingSpotType;
import design.parkinglot.model.DisplayBoard;
import design.parkinglot.model.Entrance;
import design.parkinglot.model.Exit;
import design.parkinglot.model.ParkingRate;
import design.parkinglot.model.parkingspot.ParkingSpot;
import design.parkinglot.model.parkingspot.ParkingSpotFactory;
import lombok.Getter;
import lombok.Setter;

public abstract class Account {
    @Getter
    private String username;
    @Getter
    private String password;
    @Getter
    private Person person;
    @Getter
    @Setter
    private AccountStatus status;

    public Account(String username, String password, Person person) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.status = AccountStatus.DEFAULT;
    }

    public void login() {

    }

    public void logout() {

    }

    public void addParkingSpot(ParkingSpotType type) {

    }

    public void addEntrance(String name, Entrance entrance) {

    }

    public void addExit(String name, Exit exit) {

    }

    public void addDisplayBoard(DisplayBoard board) {

    }

    public void updateParkingRate(ParkingRate rate) {

    }

    public abstract void resetPassword();
}
