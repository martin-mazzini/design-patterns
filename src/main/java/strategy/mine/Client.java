package strategy.mine;

public class Client {

    public static void main(String[] args) {


        ShoppingCart shoppingCart = new ShoppingCart(new PaypalStrategy("pedroperez@gmail.com", "dsxcc"));


        shoppingCart.addItem(new Item(34));
        shoppingCart.addItem(new Item(60));
        shoppingCart.pay();

        shoppingCart.setPaymentMethod(new CreditCardStrategy("Jorge blanco", "7843 8437 7563 2183", "842837483274234", "12/02/2022"));


        shoppingCart.addItem(new Item(34));
        shoppingCart.pay();


    }
}



