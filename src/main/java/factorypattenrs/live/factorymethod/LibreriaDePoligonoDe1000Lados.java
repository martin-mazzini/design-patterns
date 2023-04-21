package factorypattenrs.live.factorymethod;

import factorypattenrs.live.factorymethod.polygons.Polygon;

public class LibreriaDePoligonoDe1000Lados extends LibreriaDePoligonos{

    @Override
    public Polygon buildPolygon() {
        return new PoligonoDe1000Lados();
    }
}
