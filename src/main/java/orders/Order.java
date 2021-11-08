package orders;

import delivery.Delivery;
import flowers.Item;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;
import users.User;

import java.util.LinkedList;
import java.util.List;

public class Order {
    @Getter @Setter
    private LinkedList<Item> items;
    @Getter
    private Payment payment;
    @Getter
    private Delivery delivery;

    private List<User> users;

    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for(Item item: items) {
            price += item.getPrice();
        }
        return price;
    }

    public boolean processOrder() {
        boolean paid = this.payment.pay(calculateTotalPrice());
        boolean delivered = this.delivery.deliver(items);
        return paid && delivered;
    }

    public void addItem(Item toAdd) {
        this.items.add(toAdd);
    }

    public void removeItem(Item toRemove) {
        this.items.remove(toRemove);
    }

    public void addUser(User toAdd) {
        users.add(toAdd);
    }

    public void removeUser(User toRemove) {
        users.remove(toRemove);
    }

    public void notifyUsers() {
        for (User user: users) {
            user.update("The package was sent");
        }
    }
}
