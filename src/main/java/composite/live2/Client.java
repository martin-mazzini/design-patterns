package composite.live2;

public class Client {


    public static void main(String[] args) {

        //Tenemos cajas e items (ver estructura)
        //Queremos poder meter items adentros de cajas
        //Queremos poder calcular el precio sobre un item o una caja
        //Queremos que el cliente VEA LA ESTRUCTURA COMO SI FUERA UN SIMPLE ELEMENTO. No queremos que sepa de arboles.

        Caja cajaDeAdentro = new Caja();
        cajaDeAdentro.addNode(new Item(50));
        cajaDeAdentro.addNode(new Item(50));



        Caja caja = new Caja();
        caja.addNode(new Item(5));
        caja.addNode(new Item(15));
        caja.addNode(cajaDeAdentro);
        int price = caja.getPrice();
        System.out.println("Precio de la caja = " + price);




        //QUeremos poder preguntar nombre de items sobre un item o una caja


    }





}
