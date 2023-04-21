package facade.shoppingFacade;

public class Order {
    private String itemName;
    private int quantity;

    public Order(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
}
