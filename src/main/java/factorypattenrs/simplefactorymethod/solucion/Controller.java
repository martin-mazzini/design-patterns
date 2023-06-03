package factorypattenrs.simplefactorymethod.solucion;


public class Controller {


    private PolygonProcessor polygonProcessor;


    //GET REQUEST
    public void getPolygon(String polygonStr){


        polygonProcessor.process(polygonStr);

    }


}
