package visitor;

public class Client {

    public static void main(String[] args) {
        // Create a visitor
        ConcreteVisitor visitor = new ConcreteVisitor();

        // Create some elements
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        // Call the accept() method on the elements, passing the visitor as an argument
        elementA.accept(visitor);
        elementB.accept(visitor);
    }

}
