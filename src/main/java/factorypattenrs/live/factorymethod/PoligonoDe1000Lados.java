package factorypattenrs.live.factorymethod;

import factorypattenrs.live.factorymethod.polygons.Polygon;

public class PoligonoDe1000Lados implements Polygon {
    @Override
    public String getType() {
        return "POLIGONO DE 1000 LADOS";
    }

    @Override
    public Integer getNumberOfSides() {
        return 10;
    }
}
