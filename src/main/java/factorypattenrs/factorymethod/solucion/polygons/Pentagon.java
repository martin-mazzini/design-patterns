package factorypattenrs.factorymethod.solucion.polygons;

public class Pentagon implements Polygon {
    @Override
    public String getType() {
        return "Pentagon";
    }

    @Override
    public Integer getNumberOfSides() {
        return 5;
    }
}
