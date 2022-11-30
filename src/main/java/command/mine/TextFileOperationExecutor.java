package command.mine;

import command.mine.commands.TextFileOperation;

import java.util.ArrayList;
import java.util.List;

/** Invoker o sender */
public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();
    //receiver


    public void executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        textFileOperation.execute();
    }


    public void printCommandHistory(){
        for (TextFileOperation textFileOperation: textFileOperations){
            System.out.println(textFileOperation.operationName());
        }
    }


}
