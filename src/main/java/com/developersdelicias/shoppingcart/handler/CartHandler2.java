package main.java.com.developersdelicias.shoppingcart.handler;

import main.java.com.developersdelicias.shoppingcart.Item;
import main.java.com.developersdelicias.shoppingcart.ShoppingCart;

import java.util.List;

public class CartHandler2 {

    private ShoppingCart shoppingCart;

    public void addItemsToCart(List<Item> items) {

        boolean isValid = validate();


        if (isValid) {
            sendMessage();

            for (Item item :items) {
                getShoppingCart().addItem(item);
            }


            postAddItems(items);

        } else {
            System.out.println("Can't add to cart :(");
        }

    }


    protected boolean validate() {
        return getShoppingCart().getItems().size() > 0;
    }

    protected void postAddItems(List<Item> items) {
        //do some stuff after processing

    }

    protected void sendMessage() {
        System.out.print("Items are being added to the cart...");
    }


    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
