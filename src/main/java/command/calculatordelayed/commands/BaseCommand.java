package command.calculatordelayed.commands;

import command.calculatordelayed.Calculator;

/**
 * Base abstract command
 * Concrete command implementations have to inherit from this class
 */
public abstract class BaseCommand implements Runnable {

    protected Calculator calculator;
    protected double operand;
    protected boolean executed;

    public BaseCommand(Calculator calculator, double operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    abstract public void execute();

    abstract public void undo();

    abstract public String operationName();

    public boolean isExecuted(){
        return executed;
    }


    public void run(){
        execute();
    }

}
