package command.calculator.commands;

import command.calculator.Calculator;

/**
 * Base abstract command
 * Concrete command implementations have to inherit from this class
 */
public abstract class BaseCommand {

    protected Calculator calculator;
    protected double operand;

    public BaseCommand(Calculator calculator, double operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    abstract public void execute();

    abstract public void undo();

    abstract public String operationName();

}
