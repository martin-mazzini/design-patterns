package factorypattenrs.abstractfactory.polygons.triangle;

import factorypattenrs.abstractfactory.polygons.square.Square;

public class RedTriangle extends Triangle {


    @Override
    protected String getColor() {
        return "red";
    }
}
