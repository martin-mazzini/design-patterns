package command.calculatorserializable.commands;

public interface Command {

    public void execute();
    public void undo();
    public String operationName();
}
