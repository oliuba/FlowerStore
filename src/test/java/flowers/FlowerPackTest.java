package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack pack;
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(50);
        pack = new FlowerPack();
        pack.setFlower(flower);
        pack.setAmount(9);
    }

    @Test
    void price() {
        assertEquals(450, pack.price());
    }

    @Test
    void getFlower() {
        assertEquals(flower, pack.getFlower());
    }

    @Test
    void getAmount() {
        assertEquals(9, pack.getAmount());
    }
}