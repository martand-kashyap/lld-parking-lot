package design.parkinglot.model.account;

import design.parkinglot.common.Person;

public class Admin extends Account {
    public Admin(String username, String password, Person person) {
        super(username, password, person);
    }

    @Override
    public void resetPassword() {

    }

    /*
    ToDo
    add parking spot
    add entrance
    add exit
    add display board
    update parking rate
     */
}
