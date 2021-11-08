package orders;

import orders.Order;
import orders.QuickOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    private Order order;

    @Test
    void createOrder() {
        order = QuickOrder.createOrder(QuickOrder.ROSE_BUCKET, 100, 7);
        assertEquals(700, order.calculateTotalPrice());
    }
}