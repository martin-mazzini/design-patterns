package factorypattenrs.abstractfactory.solucion;

import factorypattenrs.abstractfactory.solucion.polygons.square.RedSquare;
import factorypattenrs.abstractfactory.solucion.polygons.square.Square;
import factorypattenrs.abstractfactory.solucion.polygons.triangle.RedTriangle;
import factorypattenrs.abstractfactory.solucion.polygons.triangle.Triangle;

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
