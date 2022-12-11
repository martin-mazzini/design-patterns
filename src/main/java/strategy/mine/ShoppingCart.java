package strategy.mine;


import java.util.ArrayList;

public class ShoppingCart {
    //List of items
    ArrayList<Item> items;
    PaymentStrategy paymentMethod;

    public ShoppingCart(PaymentStrategy paymentMethod){
        this.items=new ArrayList<Item>();
        this.paymentMethod = paymentMethod;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
