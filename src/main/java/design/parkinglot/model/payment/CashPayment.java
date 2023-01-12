package design.parkinglot.model.payment;

public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public boolean initiateTransaction() {
        return true;
    }
}
