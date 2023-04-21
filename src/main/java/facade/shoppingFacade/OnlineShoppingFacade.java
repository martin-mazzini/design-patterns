package facade.shoppingFacade;

public class OnlineShoppingFacade {
    private InventorySystem inventorySystem;
    private OrderSystem orderSystem;
    private PaymentSystem paymentSystem;

    public OnlineShoppingFacade() {
        inventorySystem = new InventorySystem();
        orderSystem = new OrderSystem();
        paymentSystem = new PaymentSystem();
    }

    public void placeOrder(String itemName, int quantity, String paymentMethod) {
        if (!inventorySystem.isItemAvailable(itemName, quantity)) {
            System.out.println("Sorry, the item is not available in the desired quantity");
            return;
        }

        Order order = orderSystem.createOrder(itemName, quantity);
        double totalPrice = orderSystem.calculateTotalPrice(order);

        if (!paymentSystem.makePayment(totalPrice, paymentMethod)) {
            System.out.println("Sorry, the payment could not be processed");
            return;
        }

        orderSystem.confirmOrder(order);
        inventorySystem.updateInventory(itemName, quantity);
        System.out.println("Order placed successfully!");
    }
}
