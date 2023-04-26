package visitor.basico;

public class ElementB implements Element {

        public void accept(Visitor visitor) {
            visitor.visitElementB(this);
        }
}
