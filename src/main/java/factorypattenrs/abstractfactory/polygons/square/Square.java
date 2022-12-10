package factorypattenrs.abstractfactory.polygons.square;

import factorypattenrs.abstractfactory.polygons.Polygon;

public abstract class Square implements Polygon {


    @Override
    public String getType() {
        return "Square: " + getColor();
    }

    protected abstract String getColor();
}
