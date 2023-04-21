package command.calculator;

import command.calculator.commands.AddCommand;
import command.calculator.commands.SubtractCommand;


public class Client {

    /**
     * https://www.baeldung.com/java-command-pattern
     */

    public static void main(String[] args) {

        Calculator calculator = new Calculator(5);
        CalculatorOperationExecutor calculatorExecutor = new CalculatorOperationExecutor();


        calculatorExecutor.executeOperation(new AddCommand(calculator, 5));
        calculatorExecutor.executeOperation(new AddCommand(calculator, 10));
        calculatorExecutor.executeOperation(new SubtractCommand(calculator, 7));

        calculatorExecutor.printCommandHistory();

        calculatorExecutor.undoLastOperation();
        calculatorExecutor.undoLastOperation();
        calculatorExecutor.undoLastOperation();

        calculatorExecutor.printCommandHistory();


    }
}
