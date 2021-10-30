package decorators;

import flowers.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    public String toString() {
        String old = super.toString();
        String replacement = "$1" + String.valueOf(this.getPrice()) + "$2";
        String newstr = old.replaceAll("(price=)[^&]*(,)", replacement);
        return newstr;
    }
}
