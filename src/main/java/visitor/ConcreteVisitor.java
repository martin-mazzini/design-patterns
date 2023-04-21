package visitor;
//LA clase visitor tiene toodo el comportamiento que queremos
//para las distintas subclases de nuestra Jerarquia (Element)
public class ConcreteVisitor implements Visitor {


        public void visitElementA(ElementA element) {
            //dibujando al cuadrado
            System.out.println("Procesando el Elemento A.");
        }

        public void visitElementB(ElementB element) {
            //dibujando al circulo
            System.out.println("Procesando el Elemento B");
        }

        //public void visitElement(ElementC element){
        // }
}
