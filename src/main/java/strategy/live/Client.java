package strategy.live;

public class Client {

    public static void main(String[] args) {


        //Definir distintas estrategias de pago
        //No queremos una cadena de if-else o switch
        //Queremos que la logica del metodo de pago quede separada del shopping cart
        //Queremos tener Open closed principle
        //Querriamos poder cambiarlo durante el tiempo de ejecucion (runtime) si fuera necesario

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item(34));
        shoppingCart.addItem(new Item(60));
        shoppingCart.pay();





    }
}



