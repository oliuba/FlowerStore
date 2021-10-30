import decorators.PaperDecorator;
import flowers.FlowerBucket;
import flowers.Item;

public class Main {
    public static void main(String[] args) {
        Item bucket = new FlowerBucket();
        bucket = new PaperDecorator(bucket);
    }
}
