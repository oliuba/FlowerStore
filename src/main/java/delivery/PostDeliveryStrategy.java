package delivery;

import flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Delivered" + items + "by post");
        return true;
    }
}
