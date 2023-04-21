package command.live;
// Receiver.
public class Calculator {

    private double valorActual = 0;

    public Calculator(){}

    public void add(Double a){
        double newResult = valorActual + a;
        valorActual = newResult;
        System.out.println("Adding: " + a + ". New result is: " + newResult);
    }

    public void subtract(Double a){
        double newResult = valorActual - a;
        valorActual = newResult;
        System.out.println("Subtracting: " + a + ". New result is: " + newResult);
    }

    public void multiply(Double a){
        double newResult = valorActual * a;
        valorActual = newResult;
        System.out.println("Multiplty: " + a + ".New result is: " + newResult);
    }

    public void divide(Double a){
        double newResult = valorActual / a;
        valorActual = newResult;
        System.out.println("Divide: " + a + ".New result is: " + newResult);
    }






}
