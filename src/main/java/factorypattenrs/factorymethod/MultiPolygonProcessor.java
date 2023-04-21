package factorypattenrs.factorymethod;

import factorypattenrs.factorymethod.polygons.Polygon;
import factorypattenrs.factorymethod.polygons.Square;

public class MultiPolygonProcessor extends PolygonProcessor {
    @Override
    protected Polygon createPolygon() {
        if (sides == 0){

        }
        return new Square();
    }


    private Integer sides;




}
