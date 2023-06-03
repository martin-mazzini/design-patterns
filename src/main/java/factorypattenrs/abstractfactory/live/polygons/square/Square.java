package factorypattenrs.abstractfactory.live.polygons.square;

import factorypattenrs.abstractfactory.live.polygons.Polygon;

public abstract class Square implements Polygon {


    @Override
    public String getType() {
        return "Square: " + getColor();
    }

    protected abstract String getColor();
}
