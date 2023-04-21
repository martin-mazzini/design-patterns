package factorypattenrs.live.abstractfactory;

import factorypattenrs.live.abstractfactory.polygons.square.Cuadrilatero;
import factorypattenrs.live.abstractfactory.polygons.square.CuadrilateroAzul;
import factorypattenrs.live.abstractfactory.polygons.square.CuadrilateroRojo;
import factorypattenrs.live.abstractfactory.polygons.triangle.Triangulo;
import factorypattenrs.live.abstractfactory.polygons.triangle.TrianguloAzul;
import factorypattenrs.live.abstractfactory.polygons.triangle.TrianguloRojo;

public class BluePolygonFactory implements PolygonFactory{


    @Override
    public Cuadrilatero buildCuadrilatero() {
        return new CuadrilateroAzul();
    }

    @Override
    public Triangulo buildTriangulo() {
        return new TrianguloAzul();
    }


}
