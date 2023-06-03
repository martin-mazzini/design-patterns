package factorypattenrs.simplefactorymethod.solucion.polygons;

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
