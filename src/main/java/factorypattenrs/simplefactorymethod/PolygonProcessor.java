package factorypattenrs.simplefactorymethod;


import factorypattenrs.simplefactorymethod.polygons.Polygon;

public class PolygonProcessor {


    private PolygonFactory polygonFactory;


    public PolygonProcessor(PolygonFactory polygonFactory) {
        this.polygonFactory = polygonFactory;
    }

    public Polygon process(String polygonStr){


        //obtener un poligono
        Polygon polygon = polygonFactory.getPolygon(polygonStr);

        //logica de negocio con poligono
        System.out.println(polygon.getType());

        return polygon;


    }


}
