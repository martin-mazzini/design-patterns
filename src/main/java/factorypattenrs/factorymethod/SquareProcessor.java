package factorypattenrs.factorymethod;

import factorypattenrs.factorymethod.polygons.Polygon;
import factorypattenrs.factorymethod.polygons.Square;

public class SquareProcessor extends PolygonProcessor {
    @Override
    protected Polygon createPolygon() {
        return new Square();
    }
}
