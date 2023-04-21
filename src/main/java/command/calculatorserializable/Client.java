package command.calculatorserializable;

import command.calculatorserializable.commands.AddCommand;
import command.calculatorserializable.commands.SubtractCommand;

import java.io.IOException;


public class Client {

    /**
     * https://www.baeldung.com/java-command-pattern
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        restoreCalculator();


    }

    private static void saveCalculator() throws IOException {
        Calculator calculator = new Calculator(5);
        CalculatorOperationExecutor calculatorExecutor = new CalculatorOperationExecutor();


        calculatorExecutor.executeOperation(new AddCommand(calculator, 5));
        calculatorExecutor.executeOperation(new AddCommand(calculator, 10));
        calculatorExecutor.executeOperation(new SubtractCommand(calculator, 7));

        calculatorExecutor.saveToFile();
    }



    private static void restoreCalculator() throws IOException, ClassNotFoundException {
        CalculatorOperationExecutor calculatorOperationExecutor = CalculatorOperationExecutor.restoreFromFile();
        calculatorOperationExecutor.printCommandHistory();
    }
}
