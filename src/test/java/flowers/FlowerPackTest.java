package flowers;

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

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(450, pack.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlower() {
        assertEquals(flower, pack.getFlower());
    }

    @org.junit.jupiter.api.Test
    void getAmount() {
        assertEquals(9, pack.getAmount());
    }
}