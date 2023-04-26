package visitor.basico;

public class ElementA implements Element {

        public void accept(Visitor visitor) {
            visitor.visitElementA(this);
        }
}
