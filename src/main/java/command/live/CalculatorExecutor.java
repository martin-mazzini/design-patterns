package command.live;

import command.calculator.commands.BaseCommand;

import java.util.ArrayList;
import java.util.List;

public class CalculatorExecutor {

    private List<Command> executedOperations = new ArrayList<>();


    public void executeCommand(Command command){
        command.execute();
        executedOperations.add(command);
    }

    public void printHistory(){
        for (Command command: executedOperations){
            System.out.println(command.getCommandName());
        }
    }

    public void undo(){
        if (!this.executedOperations.isEmpty()){
            int lastIndex = executedOperations.size() - 1;
            Command lastOp = executedOperations.get(lastIndex);
            executedOperations.remove(lastIndex);
            System.out.println("-----Undoing: " + lastOp.getCommandName() + "  --------");
            System.out.println("There are " + executedOperations.size() + " left");
            lastOp.undo();
        }else{
            System.out.println("No operation left to undo");
        }
    }






}
