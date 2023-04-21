package factorypattenrs.factorymethod.polygons;

public class Heptagon implements Polygon {
    @Override
    public String getType() {
        return "Heptagon";
    }

    @Override
    public Integer getNumberOfSides() {
        return 7;
    }


}
