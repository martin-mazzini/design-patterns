package command.live;

public class RestarCommand extends BaseCommand {


    public RestarCommand(Calculator calculator, Double operando) {
        super(calculator, operando);
    }

    @Override
    public void undo() {
        this.calculator.add(operando);
    }

    @Override
    public void execute() {
        this.calculator.subtract(operando);
    }

    @Override
    public String getCommandName() {
        return "RESTA";
    }
}
