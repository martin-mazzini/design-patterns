package factorypattenrs.abstractfactory;

import factorypattenrs.abstractfactory.polygons.square.BlueSquare;
import factorypattenrs.abstractfactory.polygons.square.Square;
import factorypattenrs.abstractfactory.polygons.triangle.BlueTriangle;
import factorypattenrs.abstractfactory.polygons.triangle.Triangle;

public class BluePolygonFactory extends AbstractPolygonFactory{
    @Override
    public Square getSquare() {
        return new BlueSquare();
    }

    @Override
    public Triangle getTriangle() {
        return new BlueTriangle();
    }
}
