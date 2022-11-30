package command.mine.commands;

import command.mine.TextFile;

public class WriteTextOperation implements TextFileOperation {

    private TextFile textFile;
    private String textToWrite;


    public WriteTextOperation(TextFile textFile, String textToWrite) {
        this.textFile = textFile;
        this.textToWrite = textToWrite;
    }


    @Override
    public void execute() {
        textFile.append(textToWrite);
    }

    @Override
    public String operationName() {
        return "Write";
    }

}
