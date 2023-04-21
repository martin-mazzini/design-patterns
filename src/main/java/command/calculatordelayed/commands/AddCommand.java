package command.calculatordelayed.commands;

import command.calculatordelayed.Calculator;

/**
 * Concrete command implementation
 */
public class
AddCommand extends BaseCommand {


    public AddCommand(Calculator calculator, double operand) {
        super(calculator, operand);
    }

    @Override
    public void execute() {
        this.calculator.add(operand);
        this.executed = true;
    }

    @Override
    public void undo() {
        this.calculator.subtract(operand);
    }

    @Override
    public String operationName() {
        return "Add";
    }


}
