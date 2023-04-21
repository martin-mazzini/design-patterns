package factorypattenrs.live.simplefactorymethod;

import factorypattenrs.factorymethod.polygons.Polygon;
import factorypattenrs.live.abstractfactory.ColoredPolygons;

public  class PolygonService {

    public Polygon process(String polygonStr){

        //Polygon???
        Polygon polygon = null;

        System.out.println("Procesando poligono " + polygon.getType());

        System.out.println("Cantidad de lados del poligono" + polygon.getType());

        System.out.println();

        return polygon;
    }


}
