package factorypattenrs.abstractfactory;

import factorypattenrs.abstractfactory.polygons.square.RedSquare;
import factorypattenrs.abstractfactory.polygons.square.Square;
import factorypattenrs.abstractfactory.polygons.triangle.RedTriangle;
import factorypattenrs.abstractfactory.polygons.triangle.Triangle;

public class RedPolygonFactory extends AbstractPolygonFactory{
    @Override
    public Square getSquare() {
        return new RedSquare();
    }

    @Override
    public Triangle getTriangle() {
        return new RedTriangle();
    }
}
