package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    private FlowerBucket bucket;
    private FlowerPack pack;
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        pack = new FlowerPack(flower, 5);
        bucket = new FlowerBucket();
        bucket.addFlowerPack(pack);
        store = new Store();
    }

    @Test
    void addBucket() {
        store.addBucket(bucket);
        assertEquals(bucket, store.getGoods().get("Bucket").get(0));
    }

    @Test
    void addPack() {
        store.addPack(pack);
        assertEquals(pack, store.getGoods().get("Pack").get(0));
    }

    @Test
    void addFlower() {
        store.addFlower(flower);
        assertEquals(flower, store.getGoods().get("Flower").get(0));
    }

    @Test
    void search() {
        addPack();
        Object gotPack = store.search("Pack").get(0);
        assertEquals(pack, gotPack);

        addFlower();
        Object gotFlower = store.search("Flower").get(0);
        assertEquals(flower, gotFlower);

        addBucket();
        Object gotBucket = store.search("Bucket").get(0);
        assertEquals(bucket, gotBucket);
    }
}