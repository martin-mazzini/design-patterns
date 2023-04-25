package decorator.live;

public abstract class DecoradorBase implements Printer {

    protected Printer next;

    public DecoradorBase(Printer next){
        this.next = next;
    }



}
