package factorypattenrs.abstractfactory;

import factorypattenrs.abstractfactory.polygons.square.Square;
import factorypattenrs.abstractfactory.polygons.triangle.Triangle;

public class Client {




    public static void main(String[] args) {


        System.out.println("---Process polygons with Red Factory-----");
        processPolygons(new RedPolygonFactory());


        System.out.println("---Process polygons with Blue Factory-----");
        processPolygons(new BluePolygonFactory());


    }

    private static void processPolygons(AbstractPolygonFactory polygonFactory) {
        Square square = polygonFactory.getSquare();

        //do something with square

        System.out.println("Processing " + square.getType());
        Triangle triangle = polygonFactory.getTriangle();

        //do something with triangle
        System.out.println("Processing " + triangle.getType());
    }
}
