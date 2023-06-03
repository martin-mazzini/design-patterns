package factorypattenrs.abstractfactory.solucion.polygons.square;

import factorypattenrs.abstractfactory.solucion.polygons.Polygon;

public abstract class Square implements Polygon {


    @Override
    public String getType() {
        return "Square: " + getColor();
    }

    protected abstract String getColor();
}
