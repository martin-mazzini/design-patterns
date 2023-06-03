package factorypattenrs.simplefactorymethod.solucion.polygons;

public class Octagon implements Polygon {

    @Override
    public String getType() {
        return "Octagon";
    }

    @Override
    public Integer getNumberOfSides() {
        return 8;
    }
}
