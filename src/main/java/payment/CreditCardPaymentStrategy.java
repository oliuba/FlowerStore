package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %f with credit card\n", price);
        return true;
    }
}