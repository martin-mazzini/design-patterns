package factorypattenrs.abstractfactory.solucion;

import factorypattenrs.abstractfactory.solucion.polygons.square.Square;
import factorypattenrs.abstractfactory.solucion.polygons.triangle.Triangle;

public abstract  class AbstractPolygonFactory {


    public abstract Square getSquare();

    public abstract Triangle getTriangle();

    //same thing for other shapes


}
