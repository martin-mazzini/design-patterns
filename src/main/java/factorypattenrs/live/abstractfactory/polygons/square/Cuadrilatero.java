package factorypattenrs.live.abstractfactory.polygons.square;



public abstract class Cuadrilatero {


    public Integer lado1;
    public Integer lado2;
    public Integer lado3;
    public Integer lado4;

    public String getType() {
        return "Square: " + getColor();
    }

    public abstract String getColor();
}
