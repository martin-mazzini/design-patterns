package factorypattenrs.live.abstractfactory;

import factorypattenrs.live.abstractfactory.polygons.square.Cuadrilatero;
import factorypattenrs.live.abstractfactory.polygons.triangle.Triangulo;

public class ColoredPolygonService {

    private PolygonFactory polygonFactory;

    public ColoredPolygonService(PolygonFactory polygonFactory) {
        this.polygonFactory = polygonFactory;
    }

    public ColoredPolygons processPolygons() {

        //AHora cuadrilatero y triangulo SON DOS JERARQUIAS APARTE
        Cuadrilatero cuadrilatero = polygonFactory.buildCuadrilatero();
        cuadrilatero.lado1 = 10;
        cuadrilatero.lado2 = 20;
        cuadrilatero.lado3 = 3030;
        cuadrilatero.lado4 = 10;

        System.out.println("Processing " + cuadrilatero.getType());

        Triangulo triangulo = polygonFactory.buildTriangulo();
        triangulo.lado1 = 10;
        triangulo.lado2 = 30;
        triangulo.lado3 = 20;

        System.out.println("Processing " + triangulo.getType());

        if (!triangulo.getColor().equals(cuadrilatero.getColor())){
            throw new RuntimeException("EL COLOR NO COINCIDE!!!");
        }

        return new ColoredPolygons(triangulo, cuadrilatero);
    }


}
