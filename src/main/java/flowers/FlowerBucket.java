package flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class FlowerBucket {
    @Getter @Setter
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.price();
        }
        return price;
    }
}
