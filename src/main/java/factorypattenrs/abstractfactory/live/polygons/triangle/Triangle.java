package factorypattenrs.abstractfactory.live.polygons.triangle;

import factorypattenrs.abstractfactory.live.polygons.Polygon;

public abstract class Triangle implements Polygon {


    @Override
    public String getType() {
        return "Triangle: " + getColor();
    }

    protected abstract String getColor();
}
