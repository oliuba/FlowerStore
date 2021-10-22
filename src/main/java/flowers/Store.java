package flowers;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;

@Getter
public class Store {
    private HashMap<String, ArrayList> goods = new HashMap<>();

    public Store() {
        goods.put("Bucket", new ArrayList<FlowerBucket>());
        goods.put("Pack", new ArrayList<FlowerPack>());
        goods.put("Flower", new ArrayList<Flower>());
    }

    public void addBucket(FlowerBucket bucket) {
        goods.get("Bucket").add(bucket);
    }

    public void addPack(FlowerPack pack) {
        goods.get("Pack").add(pack);
    }

    public void addFlower(Flower flower) {
        goods.get("Flower").add(flower);
    }

    public ArrayList search(String GoodsType) {
        return goods.get(GoodsType);
    }
}
