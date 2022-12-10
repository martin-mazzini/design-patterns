package factorypattenrs.abstractfactory;

import factorypattenrs.abstractfactory.polygons.square.Square;
import factorypattenrs.abstractfactory.polygons.triangle.Triangle;

public abstract  class AbstractPolygonFactory {


    public abstract Square getSquare();

    public abstract Triangle getTriangle();

    //same thing for other shapes


}
