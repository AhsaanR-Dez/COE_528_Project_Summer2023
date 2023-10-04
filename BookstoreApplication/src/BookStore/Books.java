package BookStore;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Books {
    private final String name;
    private final double price;
    private final BooleanProperty select;

    public Books(String name, double price) {
        this.name = name; // No need to create a new String object, as String is immutable
        this.price = price;
        this.select = new SimpleBooleanProperty(false);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public BooleanProperty getSelect() {
        return this.select;
    }

    public void setSelect(boolean select) { // Change the parameter type to boolean
        this.select.set(select); // Instead of setting the entire BooleanProperty, update its value using set()
    }
}
