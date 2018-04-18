package main.java.com.developersdelicias.shoppingcart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    private static ShoppingCart cart;

    private List<Item> items;

    protected ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (null == cart) {
            cart = new ShoppingCart();
        }

        return cart;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items)
    }

    public void addItem(Item item) {
        this.items.add(item);
    }


}
