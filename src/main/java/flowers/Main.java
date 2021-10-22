package flowers;

import static flowers.FlowerType.CHAMOMILE;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(CHAMOMILE);
            flowers[i].setColor(color);
        }

        color[1] = 127;

        for (Flower flower: flowers) {
            System.out.println(flower);
        }
    }
}
