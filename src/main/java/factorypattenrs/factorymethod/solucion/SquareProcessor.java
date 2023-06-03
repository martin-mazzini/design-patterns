package factorypattenrs.factorymethod.solucion;

import factorypattenrs.factorymethod.solucion.polygons.Polygon;
import factorypattenrs.factorymethod.solucion.polygons.Square;

public class SquareProcessor extends PolygonProcessor {
    @Override
    protected Polygon createPolygon() {
        return new Square();
    }
}
