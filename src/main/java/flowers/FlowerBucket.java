package flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    @Getter @Setter
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public String getDescription() {
        return "FlowerBucket";
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
