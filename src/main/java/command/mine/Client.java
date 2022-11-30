package command.mine;

import command.mine.commands.EraseTextOperation;
import command.mine.commands.WriteTextOperation;

public class Client {

    /**
     * https://www.baeldung.com/java-command-pattern
     */

    public static void main(String[] args) {

        TextFile textFile = new TextFile("Command is behavioral design pattern that");
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        textFileOperationExecutor.executeOperation(new WriteTextOperation(textFile,"converts requests or simple operations into objects."));
        textFileOperationExecutor.executeOperation(new EraseTextOperation(textFile));
        textFileOperationExecutor.executeOperation(new WriteTextOperation(textFile,"Hola"));

        textFileOperationExecutor.printCommandHistory();



    }
}
