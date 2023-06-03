package factorypattenrs.abstractfactory.live;

import factorypattenrs.abstractfactory.solucion.AbstractPolygonFactory;
import factorypattenrs.abstractfactory.solucion.polygons.square.Square;
import factorypattenrs.abstractfactory.solucion.polygons.triangle.Triangle;

public class Client {




    public static void main(String[] args) {



        //Queremos usar un factory de formas
        //Pero queremos asegurarnos de instanciar clases del mismo COLOR
        //SI le pido un triangulo y un cuadrado al factory, me tiene que devolver rojos



    }

    private static void processPolygons() {
        Square square = null;

        //do something with square
        System.out.println("Processing " + square.getType());
        Triangle triangle = null;

        //do something with triangle
        System.out.println("Processing " + triangle.getType());
    }

}
