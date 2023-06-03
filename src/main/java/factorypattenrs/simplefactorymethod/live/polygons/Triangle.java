package factorypattenrs.simplefactorymethod.live.polygons;

import factorypattenrs.simplefactorymethod.live.polygons.Polygon;

public class Triangle implements Polygon {

    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public Integer getNumberOfSides() {
        return 3;
    }
}
