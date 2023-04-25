package composite.live2;

public class Item implements Nodo {


    private int price;

    public Item(int price){
        this.price = price;
    }


    @Override
    public int getPrice() {
        return price;
    }
}
