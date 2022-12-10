package factorypattenrs.factorymethod;

import factorypattenrs.factorymethod.polygons.Polygon;
import factorypattenrs.factorymethod.polygons.Triangle;

public class TriangleProcessor extends PolygonProcessor{
    @Override
    protected Polygon createPolygon() {
        return new Triangle();
    }
}
