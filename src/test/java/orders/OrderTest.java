package orders;

import delivery.PostDeliveryStrategy;
import flowers.Flower;
import flowers.FlowerPack;
import flowers.FlowerType;
import flowers.Item;
import orders.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.CreditCardPaymentStrategy;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;
    private LinkedList<Item> items;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.TULIP);
        flower.setPrice(10);
        items = new LinkedList<Item>();
        items.add(flower);
        items.add(new FlowerPack(flower, 9));
        order = new Order();
        order.setItems(items);
    }

    @Test
    void setPaymentStrategy() {
        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        assertEquals(new CreditCardPaymentStrategy().getClass(), order.getPayment().getClass());
    }

    @Test
    void setDeliveryStrategy() {
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        assertEquals(new PostDeliveryStrategy().getClass(), order.getDelivery().getClass());
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(100, order.calculateTotalPrice());
    }

    @Test
    void processOrder() {
        setPaymentStrategy();
        setDeliveryStrategy();
        assertTrue(order.processOrder());
    }

    @Test
    void addItem() {
        Flower toAdd = new Flower(FlowerType.ROSE);
        order.addItem(toAdd);
        assertTrue(order.getItems().contains(toAdd));
    }

    @Test
    void removeItem() {
        Flower toRemove = new Flower(FlowerType.TULIP);
        order.removeItem(toRemove);
        assertFalse(order.getItems().contains(toRemove));
    }
}