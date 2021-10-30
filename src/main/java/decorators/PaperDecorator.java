package decorators;

import flowers.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 13;
    }

    @Override
    public String toString() {
        String old = super.toString();
        String replacement = "$1" + String.valueOf(this.getPrice()) + "$2";
        String newstr = old.replaceAll("(price=)[^&]*(,)", replacement);
        return newstr;
    }
}
