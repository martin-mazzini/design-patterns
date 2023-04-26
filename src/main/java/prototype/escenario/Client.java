package prototype.escenario;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String[] args) {



        List<Shape> formas = new ArrayList<>();
        formas.add(new Circle(10,40,"red", 20));
        formas.add(new Rectangle(100,1000, "blue", 999,9999));

        for (Shape shape:  formas){
            Shape copy = shape.copy();
            System.out.println(copy.toString());
        }








        Circle circulo = new Circle(10, 40, "rojo", 5);
        //primer problema, no contamos con getters para los campos que necesitamos copiar
        //y si lo crearamos, podriamos estar rompiendo el encapsulamiento deseado para la clase

        //segundo problema, si estamos trabajando con una jerarquia de objetos,
        //y estamos tabajando con la clase base de esa jerarquia
        //al momento de copiar, no sabemos que clase concreta es la que tenemos que inicializar y copiar


        List<Shape> formas2 = new ArrayList<>();
        formas2.add(new Circle(2, 20, "red", 1));
        formas2.add(new Rectangle(10, 10, "blue", 100, 20));
    }





  /*  public Shape copiar(Shape shape){
        if (shape instanceof Circle){
            //generamos un circulo y le copiamos las propiedades
            // Circle circle = new Circle();
        }
    }*/



    //no compila porque no tenemos que getters
/*
    public Circle copiar(Circle aCopiar){
        new Circle(aCopiar.getX(), aCopiar.getY())
    }
*/



}
