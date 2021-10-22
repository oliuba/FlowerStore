package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerPack pack1;
    private FlowerPack pack2;
    private FlowerPack pack3;
    private FlowerBucket bucket;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pack1 = new FlowerPack(new Flower(FlowerType.TULIP), 5);
        pack1.getFlower().setPrice(40);
        pack2 = new FlowerPack(new Flower(FlowerType.ROSE), 3);
        pack2.getFlower().setPrice(60);
        pack3 = new FlowerPack(new Flower(FlowerType.CHAMOMILE), 9);
        pack3.getFlower().setPrice(30);
        bucket = new FlowerBucket();
    }

    @Test
    void addFlowerPack() {
        bucket.addFlowerPack(pack1);
        bucket.addFlowerPack(pack2);
        bucket.addFlowerPack(pack3);
        assertEquals(pack1, bucket.getFlowerPacks().get(0));
        assertEquals(pack2, bucket.getFlowerPacks().get(1));
        assertEquals(pack3, bucket.getFlowerPacks().get(2));
    }

    @Test
    void getPrice() {
        addFlowerPack();
        assertEquals(650, bucket.getPrice());
    }

    @Test
    void getFlowerPacks() {
        addFlowerPack();
        assertArrayEquals(new FlowerPack[] {pack1, pack2, pack3}, bucket.getFlowerPacks().toArray());
    }
}