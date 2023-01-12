package design.parkinglot;

import design.parkinglot.common.Address;
import design.parkinglot.common.Person;
import design.parkinglot.model.DisplayBoard;
import design.parkinglot.model.Entrance;
import design.parkinglot.model.Exit;
import design.parkinglot.model.account.Account;
import design.parkinglot.model.account.Admin;

public class Demo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        Address address1 = new Address("abcd", "efgh", "hijkl", "mnop", "qrst");
        Person person1 = new Person("user1", address1, "1234567890", "something @something.com");
        Account admin = new Admin("user1", "admin", person1);

        //1. Admin can add entrance
        Entrance entrance1 = new Entrance();
        admin.addEntrance("entrance-1", entrance1);

        //2. Admin can add exit
        Exit exit1 = new Exit();
        admin.addExit("exit-1", exit1);

        //3. Admin can add display board
        DisplayBoard displayBoard = new DisplayBoard();
        admin.addDisplayBoard(displayBoard);

        System.out.println(ParkingLot.getInstance().toString());
        //4. Admin can update parking rate
    }
}
