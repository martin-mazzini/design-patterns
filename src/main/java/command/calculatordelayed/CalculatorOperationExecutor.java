package command.calculatordelayed;


import command.calculatordelayed.commands.BaseCommand;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** Invoker class, also called sender */
public class CalculatorOperationExecutor {

    private final List<BaseCommand> commands = new CopyOnWriteArrayList<BaseCommand>();



    ExecutorService executor = Executors.newFixedThreadPool(10);


    public void addOperation(BaseCommand mathOperation) {
        this.commands.add(mathOperation);
    }

    public void executePendingCommands(){
        for (BaseCommand command: commands){
            if (!command.isExecuted()){
                command.execute();
            }
        }
    }

    public void undoLastOperation() {
        if (!this.commands.isEmpty()){
            int lastIndex = commands.size() - 1;
            BaseCommand lastOp = commands.get(lastIndex);
            commands.remove(lastIndex);
            System.out.println("-----Undoing: " + lastOp.operationName() + "  --------");
            System.out.println("There are " + commands.size() + " left");
            lastOp.undo();
        }else{
            System.out.println("No operation left to undo");
        }
    }

    public void printCommandHistory(){
        System.out.println("---Printing command history----");
        for (BaseCommand textFileOperation: commands){
            if (textFileOperation.isExecuted()){
                System.out.println(textFileOperation.operationName());
            }
        }
        System.out.println("-------------------------------");
    }


}
