package strategy.live;

import strategy.live.strategies.PaymentMethod;
import strategy.mine.Item;

import java.util.ArrayList;
// Contexto
public class ShoppingCart {


    ArrayList<Item> items = new ArrayList<>();
    PaymentMethod paymentMethod;

    public ShoppingCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    //vamos a remover todos los if else
    //vamos a sacar la logica de pago a clases separadas (cada una de esas clase
    //va a ser Strategy concreto). Cada strategy va a ser un metodo de pago distinto
    //El contexto va a tener una instancia del Strategy para ejecutar su metodo de pago.
    //El cliente es el que tiene que decidir que strategy quiere usar


    public void pay(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        paymentMethod.pay(sum);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
