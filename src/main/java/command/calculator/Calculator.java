package command.calculator;

/** Receiver */
public class Calculator {

    private double result;

    public Calculator(double initValue){
        this.result = initValue;
        System.out.println("Calculator initialized with: " + result);
    }

    public void add(Double a){
        double newResult = result + a;
        result = newResult;
        System.out.println("Adding: " + a + ". New result is: " + newResult);
    }

    public void subtract(Double a){
        double newResult = result - a;
        result = newResult;
        System.out.println("Subtracting: " + a + ". New result is: " + newResult);
    }

    public void multiply(Double a){
        double newResult = result * a;
        result = newResult;
        System.out.println("Multiplty: " + a + ".New result is: " + newResult);
    }

    public void divide(Double a){
        double newResult = result / a;
        result = newResult;
        System.out.println("Divide: " + a + ".New result is: " + newResult);
    }



}
