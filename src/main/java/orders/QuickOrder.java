package orders;

import delivery.PostDeliveryStrategy;
import flowers.Flower;
import flowers.FlowerPack;
import flowers.FlowerType;
import flowers.Item;
import payment.CreditCardPaymentStrategy;

import java.util.LinkedList;

public enum QuickOrder {
    ROSE_BUCKET(FlowerType.ROSE),
    CHAMOMILE_BUCKET(FlowerType.CHAMOMILE),
    TULIP_BUCKET(FlowerType.TULIP);

    private FlowerType type;

    QuickOrder(FlowerType type) {
        this.type = type;
    }

    public FlowerType getType() {
        return this.type;
    }

    public static Order createOrder(QuickOrder orderFlower, int price, int amount) {
        FlowerType flowerType = orderFlower.getType();
        Flower flower = new Flower(flowerType);
        flower.setPrice(price);
        LinkedList<Item> bucket = new LinkedList<>();
        bucket.add(new FlowerPack(flower, amount));
        Order order = new Order();
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        order.setItems(bucket);
        return order;
    }
}
