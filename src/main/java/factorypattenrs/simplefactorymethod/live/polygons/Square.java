package factorypattenrs.simplefactorymethod.live.polygons;

import factorypattenrs.simplefactorymethod.live.polygons.Polygon;

public class Square implements Polygon {


    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public Integer getNumberOfSides() {
        return 4;
    }
}
