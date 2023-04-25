package decorator.live;

public class DecoradorSinEspaciosEnBlanco extends DecoradorBase{


    public DecoradorSinEspaciosEnBlanco(Printer next) {
        super(next);
    }

    @Override
    public void print(String data) {
        String sinEspaciosEnBlanco = data.replaceAll("\\s+","");
        this.next.print(sinEspaciosEnBlanco);
    }
}
