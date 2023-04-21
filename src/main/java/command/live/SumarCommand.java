package command.live;

public class SumarCommand extends BaseCommand{


    public SumarCommand(Calculator calculator, Double operando) {
        super(calculator, operando);
    }

    @Override
    public void undo() {
        this.calculator.subtract(operando);
    }

    @Override
    public void execute() {
        this.calculator.add(operando);
    }

    @Override
    public String getCommandName() {
        return "SUMA";
    }
}
