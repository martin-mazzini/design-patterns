package factorypattenrs.live.factory;

public class ServiceA {


    public FactoryPoligonos factoryPoligonos;

    public ServiceA(FactoryPoligonos factoryPoligonos) {
        this.factoryPoligonos = factoryPoligonos;
    }

    public void procesar(){
        factoryPoligonos.buildPolygon();
        //PROCESAMOS EL POLIGONO
    }
}
