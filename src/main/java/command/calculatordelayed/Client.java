package command.calculatordelayed;

import command.calculatordelayed.commands.AddCommand;
import command.calculatordelayed.commands.SubtractCommand;


public class Client {

    /**
     * https://www.baeldung.com/java-command-pattern
     */

    public static void main(String[] args) {

        Calculator calculator = new Calculator(5);
        CalculatorOperationExecutor calculatorExecutor = new CalculatorOperationExecutor();


        calculatorExecutor.addOperation(new AddCommand(calculator, 5));
        calculatorExecutor.addOperation(new AddCommand(calculator, 10));
        calculatorExecutor.addOperation(new SubtractCommand(calculator, 7));

        calculatorExecutor.printCommandHistory();
        calculatorExecutor.executePendingCommands();
        calculatorExecutor.printCommandHistory();

        calculatorExecutor.undoLastOperation();
        calculatorExecutor.undoLastOperation();
        calculatorExecutor.undoLastOperation();

        calculatorExecutor.printCommandHistory();


    }
}
