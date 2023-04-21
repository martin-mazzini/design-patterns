package strategy.live;


import strategy.live.strategies.CreditCardStrategy;
import strategy.live.strategies.PaypalStrategy;
import strategy.mine.Item;

public class Client {


    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(new PaypalStrategy("mmm@gmail.com", "sdhr73b"));

        shoppingCart.addItem(new Item(3));
        shoppingCart.addItem(new Item(10));

        shoppingCart.pay();

        shoppingCart.addItem(new Item(10));
        shoppingCart.setPaymentMethod(new CreditCardStrategy("jsdsd", "4738 43874 4387 4387", "376", "01/23"));
        shoppingCart.pay();


    }


}
