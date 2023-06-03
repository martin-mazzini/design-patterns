package factorypattenrs.simplefactorymethod.live;


import factorypattenrs.simplefactorymethod.live.polygons.Polygon;

import java.net.http.HttpResponse;

public class Controller {


    private PolygonProcessor polygonProcessor = new PolygonProcessor();
    //GET REQUEST
    public Polygon getPolygon(String polygonStr){

       //queremos convertir el string que recibimos a un poligono
       Polygon polygon = polygonProcessor.process(polygonStr);
       return polygon;

    }


}
