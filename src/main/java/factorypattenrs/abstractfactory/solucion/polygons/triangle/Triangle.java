package factorypattenrs.abstractfactory.solucion.polygons.triangle;

import factorypattenrs.abstractfactory.solucion.polygons.Polygon;

public abstract class Triangle implements Polygon {


    @Override
    public String getType() {
        return "Triangle: " + getColor();
    }

    protected abstract String getColor();
}
