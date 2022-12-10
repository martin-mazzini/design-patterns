package factorypattenrs.factorymethod;

import factorypattenrs.factorymethod.polygons.*;

public abstract class PolygonProcessor {

    public void process(){
        Polygon polygon = createPolygon();

        System.out.println("Processing square " + polygon.getType());

        //do something with polygon
        System.out.println("Drawing shape: " + polygon.getType());


        return;
    }

    protected abstract Polygon createPolygon();

}
