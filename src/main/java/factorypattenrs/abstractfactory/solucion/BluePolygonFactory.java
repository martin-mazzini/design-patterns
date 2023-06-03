package factorypattenrs.abstractfactory.solucion;

import factorypattenrs.abstractfactory.solucion.polygons.square.BlueSquare;
import factorypattenrs.abstractfactory.solucion.polygons.square.Square;
import factorypattenrs.abstractfactory.solucion.polygons.triangle.BlueTriangle;
import factorypattenrs.abstractfactory.solucion.polygons.triangle.Triangle;

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
