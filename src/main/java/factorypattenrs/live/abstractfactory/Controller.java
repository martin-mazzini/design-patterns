package factorypattenrs.live.abstractfactory;

import factorypattenrs.live.simplefactorymethod.PolygonService;

import java.net.http.HttpResponse;

public class Controller {


    private ColoredPolygonService polygonProcessor = new ColoredPolygonService(new BluePolygonFactory());

    //POST method que crea un poligono
    public HttpResponse<ColoredPolygons> getPolygon(String color){

        ColoredPolygons coloredPolygons = polygonProcessor.processPolygons();
        return null;

    }
}
