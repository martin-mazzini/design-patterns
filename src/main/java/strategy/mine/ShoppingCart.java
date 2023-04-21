package strategy.mine;


import java.util.ArrayList;
// Context
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


    public void pay(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        paymentMethod.pay(sum);
    }

    public void setPaymentMethod(PaymentStrategy paymentMethod) {
        this.paymentMethod = paymentMethod;
    }




}
