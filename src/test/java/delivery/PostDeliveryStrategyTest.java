package delivery;

import flowers.Flower;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    private PostDeliveryStrategy delivery;
    private List toDeliver;

    @BeforeEach
    void setUp() {
        delivery = new PostDeliveryStrategy();
        toDeliver = Arrays.asList(new Flower(FlowerType.ROSE), new Flower(FlowerType.TULIP));
    }

    @Test
    void deliver() {
        assertTrue(delivery.deliver(toDeliver));
    }
}