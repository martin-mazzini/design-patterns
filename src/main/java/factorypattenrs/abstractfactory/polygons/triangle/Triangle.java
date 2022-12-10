package factorypattenrs.abstractfactory.polygons.triangle;

import factorypattenrs.abstractfactory.polygons.Polygon;

public abstract class Triangle implements Polygon {


    @Override
    public String getType() {
        return "Triangle: " + getColor();
    }

    protected abstract String getColor();
}
