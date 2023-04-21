package factorypattenrs.live.abstractfactory;

import factorypattenrs.live.abstractfactory.polygons.square.Cuadrilatero;
import factorypattenrs.live.abstractfactory.polygons.triangle.Triangulo;

public interface PolygonFactory {

    public Cuadrilatero buildCuadrilatero();

    public Triangulo buildTriangulo();
}
