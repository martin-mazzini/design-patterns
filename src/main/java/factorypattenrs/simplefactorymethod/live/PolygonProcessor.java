package factorypattenrs.simplefactorymethod.live;


import factorypattenrs.simplefactorymethod.live.polygons.Polygon;

public class PolygonProcessor {




    public PolygonProcessor() {
    }

    public Polygon process(String polygonStr){


        //obtener un poligono
        Polygon polygon = null;

        //logica de negocio con poligono
        System.out.println(polygon.getType());

        return polygon;


    }


}
