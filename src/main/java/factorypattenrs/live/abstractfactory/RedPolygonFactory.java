package factorypattenrs.live.abstractfactory;

import factorypattenrs.live.abstractfactory.polygons.square.Cuadrilatero;
import factorypattenrs.live.abstractfactory.polygons.square.CuadrilateroRojo;
import factorypattenrs.live.abstractfactory.polygons.triangle.Triangulo;
import factorypattenrs.live.abstractfactory.polygons.triangle.TrianguloRojo;

public class RedPolygonFactory implements PolygonFactory{


    @Override
    public Cuadrilatero buildCuadrilatero() {
        return new CuadrilateroRojo();
    }

    @Override
    public Triangulo buildTriangulo() {
        return new TrianguloRojo();
    }


}
