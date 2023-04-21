package factorypattenrs.live.factorymethod;

import factorypattenrs.live.factorymethod.polygons.Heptagon;
import factorypattenrs.live.factorymethod.polygons.Polygon;

public abstract class LibreriaDePoligonos {


    //LOGICA DE INICIALIZACION DE POLIGONOS DE LA LIBRERIA
    public Polygon build(){

        //Open closed principle
        //Como cliente de la libreria, quiero poder definir nuevos tipos de poligonos en mi codigo, con 10,10000, o 100000000 lados.
        Polygon polygon = buildPolygon();

        System.out.println("Procesando poligono " + polygon.getType());

        System.out.println("Cantidad de lados del poligono" + polygon.getType());

        return polygon;
    }

    public abstract Polygon buildPolygon();


}
