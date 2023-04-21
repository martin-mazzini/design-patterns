package factorypattenrs.live.factory;

import factorypattenrs.live.simplefactorymethod.polygons.Polygon;
import factorypattenrs.live.simplefactorymethod.polygons.Triangle;

public class FactoryTriangulos implements FactoryPoligonos{

    @Override
    public Polygon buildPolygon() {

        return new Triangle();

    }
}
