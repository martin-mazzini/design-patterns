package command.calculatorserializable;


import command.calculatorserializable.commands.BaseCommand;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/** Invoker class, also called sender */
public class CalculatorOperationExecutor implements Serializable {

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


    public void saveToFile() throws IOException {
        FileOutputStream fileOut = new FileOutputStream("calculator.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this);
        out.close();
        fileOut.close();

    }

    public static CalculatorOperationExecutor restoreFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("calculator.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        CalculatorOperationExecutor deserializedPerson = (CalculatorOperationExecutor) in.readObject();
        in.close();
        fileIn.close();
        return deserializedPerson;
    }
}
