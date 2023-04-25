package decorator.live;

public class DecoradorHastaCiertaCantidadDeLetras extends DecoradorBase{

    Integer limit;

    public DecoradorHastaCiertaCantidadDeLetras(Printer next, Integer limite) {
        super(next);
        this.limit = limite;
    }

    @Override
    public void print(String data) {
        String masCorto = data.substring(0, limit);
        next.print(masCorto);
    }
}
