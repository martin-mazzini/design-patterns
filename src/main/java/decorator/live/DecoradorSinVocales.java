package decorator.live;

public class DecoradorSinVocales extends DecoradorBase{


    public DecoradorSinVocales(Printer next) {
        super(next);
    }

    @Override
    public void print(String data) {
        //decoro el comportamiento
        String sinVocales = data.replaceAll("[aeiouAEIOU]", "");
        this.next.print(sinVocales);

    }
}
