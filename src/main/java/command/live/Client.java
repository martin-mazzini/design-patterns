package command.live;

public class Client {


    public static void main(String[] args) {


        //Interfaz con la operacion (Command)
        //Guardamos el ultimo valor de la calculadora. El valor actual de la calculadora.
        //Guardamos el historial. Es una lista de las operaciones.
        //A medida que vamos haciendo operaciones vamos pusheando a la lista de operaciones.

        Calculator calculator = new Calculator();
        CalculatorExecutor calculatorExecutor = new CalculatorExecutor();
        calculatorExecutor.executeCommand(new SumarCommand(calculator, 5.0));
        calculatorExecutor.executeCommand(new SumarCommand(calculator, 10.0));
        calculatorExecutor.executeCommand(new RestarCommand(calculator, 5.0));
        //
        calculatorExecutor.printHistory();  //SUMA SUMA RESTA


        calculatorExecutor.undo();


    }




}
