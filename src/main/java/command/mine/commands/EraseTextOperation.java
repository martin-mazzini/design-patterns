package command.mine.commands;

import command.mine.TextFile;

public class EraseTextOperation implements TextFileOperation {

    // same field and constructor as above
    private TextFile textFile;


    public EraseTextOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.clear();
    }

    @Override
    public String operationName() {
        return "Erase";
    }

}
