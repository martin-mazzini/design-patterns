package command.mine2;

import command.mine2.commands.BaseCommand;


import java.util.ArrayList;
import java.util.List;

/** Invoker class, also called sender */
public class CalculatorOperationExecutor {

    private final List<BaseCommand> executedOperations = new ArrayList<>();



    public void executeOperation(BaseCommand mathOperation) {
        this.executedOperations.add(mathOperation);
        mathOperation.execute();
    }

    public void undoLastOperation() {
        if (!this.executedOperations.isEmpty()){
            int lastIndex = executedOperations.size() - 1;
            BaseCommand lastOp = executedOperations.get(lastIndex);
            executedOperations.remove(lastIndex);
            System.out.println("-----Undoing: " + lastOp.operationName() + "  --------");
            System.out.println("There are " + executedOperations.size() + " left");
            lastOp.undo();
        }else{
            System.out.println("No operation left to undo");
        }
    }

    public void printCommandHistory(){
        System.out.println("---Printing command history----");
        for (BaseCommand textFileOperation: executedOperations){
            System.out.println(textFileOperation.operationName());
        }
        System.out.println("-------------------------------");
    }


}
