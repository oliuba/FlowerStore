package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack() {}

    public FlowerPack(Flower flower) {
        this.flower = flower;
    }
    public double price() {
        return flower.getPrice() * amount;
    }
}
