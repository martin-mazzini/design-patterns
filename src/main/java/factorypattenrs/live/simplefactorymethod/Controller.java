package factorypattenrs.live.simplefactorymethod;

import factorypattenrs.live.simplefactorymethod.polygons.Polygon;

import java.net.http.HttpResponse;

public class Controller {


    private PolygonService polygonProcessor;

    //POST method que crea un poligono
    public HttpResponse<Polygon> getPolygon(String polygon){

        //???
        polygonProcessor.process(null);
        return null;

    }
}
