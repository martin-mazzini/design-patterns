package composite.items;
//leaf
public class Item implements Component{

    private int price;

    public Item(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        System.out.println("Precio del item: " + price);
        return price;
    }
}
