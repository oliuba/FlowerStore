package flowers;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(30);
        flower.setColor(new int[]{170, 0, 255});
        flower.setSepalLength(10);
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
     void getPrice() {
        assertEquals(30, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertArrayEquals(new int[]{170, 0, 255}, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(10, flower.getSepalLength());
    }
}