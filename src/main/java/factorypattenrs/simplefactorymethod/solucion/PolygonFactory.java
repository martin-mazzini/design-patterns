package factorypattenrs.simplefactorymethod.solucion;


import factorypattenrs.simplefactorymethod.solucion.polygons.Heptagon;
import factorypattenrs.simplefactorymethod.solucion.polygons.Pentagon;
import factorypattenrs.simplefactorymethod.solucion.polygons.Polygon;
import factorypattenrs.simplefactorymethod.solucion.polygons.Triangle;

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
