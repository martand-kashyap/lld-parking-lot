package design.parkinglot.model;

import design.parkinglot.model.payment.Payment;
import design.parkinglot.model.vehicle.Vehicle;
import lombok.Data;

import java.util.Date;

@Data
public class Ticket {
    private int ticketNumber;
    private Date timeOfEntry;
    private Date timeOfExit;
    private double cost;

    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;
}
