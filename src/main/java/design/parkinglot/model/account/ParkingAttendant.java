package design.parkinglot.model.account;

import design.parkinglot.common.Person;

public class ParkingAttendant extends Account {
    public ParkingAttendant(String username, String password, Person person) {
        super(username, password, person);
    }

    @Override
    public void resetPassword() {

    }
}
