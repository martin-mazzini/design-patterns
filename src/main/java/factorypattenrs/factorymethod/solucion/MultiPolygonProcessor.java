package factorypattenrs.factorymethod.solucion;

import factorypattenrs.factorymethod.solucion.polygons.Polygon;
import factorypattenrs.factorymethod.solucion.polygons.Square;

public class MultiPolygonProcessor extends PolygonProcessor {
    @Override
    protected Polygon createPolygon() {
        if (sides == 0){

        }
        return new Square();
    }


    private Integer sides;




}
