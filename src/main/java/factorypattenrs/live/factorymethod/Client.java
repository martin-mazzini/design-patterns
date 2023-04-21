package factorypattenrs.live.factorymethod;

import factorypattenrs.live.factorymethod.polygons.Polygon;

public class Client {


    public static void main(String[] args) {


        //LibreriaDePoligonos libreriaDePoligonos = new LibreriaDePoligonos();
        Polygon poligono = new LibreriaDePoligonoDe1000Lados().build();
        //Y DESPUES COMO USUARIO DE LA LIBRERIA HAGO COSAS CON EL POLIGONO



    }



}
