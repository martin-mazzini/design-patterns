package factorypattenrs.factorymethod;

public class Client {


    public static void main(String[] args) {
        PolygonProcessor squareProcessor = new SquareProcessor();
        squareProcessor.process();
    }

}
