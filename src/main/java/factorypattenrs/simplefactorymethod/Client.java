package factorypattenrs.simplefactorymethod;

import factorypattenrs.simplefactorymethod.polygons.Polygon;

public class Client {

    private static PolygonFactory polygonFactory = new PolygonFactory();


    public static void main(String[] args) {

        Polygon polygon = Client.createPolygon(7);
        System.out.println(polygon.getType());

    }


    public static Polygon createPolygon(int sides){
       return polygonFactory.getPolygon(sides);
    }

}
