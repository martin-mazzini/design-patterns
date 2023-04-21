package factorypattenrs.live.abstractfactory.polygons.triangle;


public abstract class Triangulo {

    public Integer lado1;
    public Integer lado2;
    public Integer lado3;

    public void construirTriangulo(){
        System.out.println("Construyendo triangulo");
    }

    public String getType() {
        return "Triangle: " + getColor();
    }

    public abstract String getColor();
}
