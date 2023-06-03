package factorypattenrs.factorymethod.live;

import factorypattenrs.factorymethod.live.polygons.Polygon;

public abstract class PolygonProcessor {

    public Polygon process(){

        Polygon polygon = createPolygon();

        System.out.println("Procesando poligono " + polygon.getType());

        System.out.println("Cantidad de lados del poligono" + polygon.getType());

        return polygon;
    }

    protected abstract Polygon createPolygon();

}
