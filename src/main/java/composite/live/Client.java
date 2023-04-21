package composite.live;

public class Client {


    public static void main(String[] args) {


        Caja cajaRaiz = new Caja("cajaRaiz");

        cajaRaiz.addComponent(new Item(10));


        Caja cajaHija = new Caja("cajaHija");
        cajaHija.addComponent(new Item(20));
        cajaHija.addComponent(new Item(50));

        cajaRaiz.addComponent(cajaHija);


        System.out.println("Precio total: " + cajaRaiz.getPrice());



    }




}
