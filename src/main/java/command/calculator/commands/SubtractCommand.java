package command.calculator.commands;

import command.calculator.Calculator;
/**
 * Concrete command implementation
 */
public class SubtractCommand extends BaseCommand {


    public SubtractCommand(Calculator calculator, double operand) {
        super(calculator, operand);
    }

    @Override
    public void execute() {
        calculator.subtract(operand);
    }

    @Override
    public void undo() {
        calculator.add(operand);
    }

    @Override
    public String operationName() {
        return "Subtract";
    }
}
