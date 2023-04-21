package factorypattenrs.simplefactorymethod;


import factorypattenrs.simplefactorymethod.polygons.Heptagon;
import factorypattenrs.simplefactorymethod.polygons.Pentagon;
import factorypattenrs.simplefactorymethod.polygons.Polygon;
import factorypattenrs.simplefactorymethod.polygons.Triangle;

public class PolygonFactory {


    public Polygon getPolygon(String polygonStr) {
        if (polygonStr.equals("TRIANGULO")){
            return new Triangle();
        }else if(polygonStr.equals("PENTAGONO")){
            return new Pentagon();
        }else if(polygonStr.equals("")){
            return new Heptagon();
        } else {
            throw new RuntimeException("EL STRING PASADO NO MAPEA A NINGUN POLIGONO: " + polygonStr);
        }
    }


}
