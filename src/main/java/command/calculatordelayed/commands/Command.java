package command.calculatordelayed.commands;

public interface Command {

    public void execute();
    public void undo();
    public String operationName();
    public boolean isExecuted();
}
