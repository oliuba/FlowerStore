package flowers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString
public class Flower extends Item {
    @Getter
    private int[] color = new int[5];
    @Getter @Setter
    private double sepalLength;
    @Getter @Setter
    private double price;

    @Override
    public String getDescription() {
        return "Flower of type " + flowerType;
    }

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    @Getter
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }
}
