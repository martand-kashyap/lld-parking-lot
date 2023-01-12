package design.parkinglot.model.payment;

public class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public boolean initiateTransaction() {
        return false;
    }
}
