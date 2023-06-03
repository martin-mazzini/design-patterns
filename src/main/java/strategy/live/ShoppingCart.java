package strategy.live;


import java.util.ArrayList;

// Context
public class ShoppingCart {
    //List of items
    ArrayList<Item> items = new ArrayList<>();



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
        //Pagar
    }





}
