package factorypattenrs.factorymethod.solucion.polygons;

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
