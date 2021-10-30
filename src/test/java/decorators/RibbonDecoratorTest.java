package decorators;

import flowers.Flower;
import flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private RibbonDecorator decorator;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.TULIP);
        flower.setPrice(10);
    }

    @Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
        decorator = new RibbonDecorator(flower);
        assertEquals(50, decorator.getPrice());
    }

    @Test
    void getDescription() {
        decorator = new RibbonDecorator(flower);
        assertEquals("Flower of type TULIP", decorator.getDescription());
    }

    @Test
    void testToString() {
        decorator = new RibbonDecorator(flower);
        assertEquals("Flower(color=[0, 0, 0, 0, 0], sepalLength=0.0, price=50.0, flowerType=TULIP)", decorator.toString());
    }
}