package factorypattenrs.factorymethod.solucion;

import factorypattenrs.factorymethod.solucion.polygons.Polygon;
import factorypattenrs.factorymethod.solucion.polygons.Triangle;

public class TriangleProcessor extends PolygonProcessor{
    @Override
    protected Polygon createPolygon() {
        return new Triangle();
    }
}
