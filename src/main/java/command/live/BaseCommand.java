package command.live;

public abstract class BaseCommand implements Command{

    protected Calculator calculator;
    protected Double operando;


    public BaseCommand(Calculator calculator, Double operando) {
        this.operando = operando;
        this.calculator = calculator;
    }





}
