package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;

    public FlowerPack() {}

    public FlowerPack(Flower flower) {
        this.flower = flower;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public String getDescription() {
        return "FlowerBucket";
    }
}
