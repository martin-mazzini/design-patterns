package factorypattenrs.live.abstractfactory;

import factorypattenrs.live.abstractfactory.polygons.square.Cuadrilatero;
import factorypattenrs.live.abstractfactory.polygons.triangle.Triangulo;

public class ColoredPolygons {

    public Triangulo triangle;
    public Cuadrilatero square;

    public ColoredPolygons(Triangulo triangle, Cuadrilatero square) {
        this.triangle = triangle;
        this.square = square;
    }
}
