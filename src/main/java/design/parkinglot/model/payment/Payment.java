package design.parkinglot.model.payment;

import design.parkinglot.constant.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public abstract class Payment {
    @Getter
    private String paymentId;
    @Getter
    private double amount;
    @Getter
    private Date timestamp;
    @Getter
    @Setter
    private PaymentStatus status;

    public Payment(double amount) {
        this.paymentId = UUID.randomUUID().toString();
        this.amount = amount;
        this.timestamp = Calendar.getInstance().getTime();
        this.status = PaymentStatus.UNPAID;
    }

    public abstract boolean initiateTransaction();
}
