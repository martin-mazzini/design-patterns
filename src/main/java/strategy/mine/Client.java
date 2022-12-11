package strategy.mine;

public class Client {

    public static void main(String[] args) {


        ShoppingCart paypalShoppingCart = new ShoppingCart(
                new PaypalStrategy("pedroperez@gmail.com", "dsxcc"));


        paypalShoppingCart.addItem(new Item(34));
        paypalShoppingCart.addItem(new Item(60));
        paypalShoppingCart.pay();

        ShoppingCart creditCardShoppingCart = new ShoppingCart(new CreditCardStrategy("Jorge blanco",
                "7843 8437 7563 2183", "842837483274234", "12/02/2022"));


        creditCardShoppingCart.addItem(new Item(34));
        creditCardShoppingCart.addItem(new Item(60));
        creditCardShoppingCart.pay();



    }
}



