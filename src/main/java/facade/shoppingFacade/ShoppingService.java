package facade.shoppingFacade;

public class ShoppingService {


    private OnlineShoppingFacade shoppingFacade;

    public ShoppingService(OnlineShoppingFacade shoppingFacade) {
        shoppingFacade = new OnlineShoppingFacade();
    }

    public void buyItem(String itemName, int quantity, String paymentMethod) {

        System.out.println("Custom logic before");

        shoppingFacade.placeOrder(itemName, quantity, paymentMethod);
        System.out.println("Order placed successfully!");

        System.out.println("Logging the transaction...");
        System.out.println("Transaction logged successfully!");

        sendConfirmationEmail(itemName, quantity);
    }

    private void sendConfirmationEmail(String itemName, int quantity) {
        // implementation to send confirmation email to the customer
    }

}
