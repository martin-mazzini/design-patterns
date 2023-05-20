package prototype.live;



import java.util.ArrayList;
import java.util.List;

public class Client {


    private Integer nombre;
    private Integer integer;

    public static void main(String[] args) {
        List<Shape> formas = new ArrayList<>();
        formas.add(new Circle(10,40,"red", 20));
        formas.add(new Rectangle(100,1000, "blue", 999,9999));
        formas.add(new Rectangle(12100,100, "green", 999,9999));


        ArrayList<Shape> shapeCopies = new ArrayList<>();
        for (Shape shape:  formas){
            Shape copy = shape.clone();
            shapeCopies.add(copy);
        }

    }






















    //Copy constructor vs copia manual
    /**
     * Consistent syntax: Copy constructors provide a consistent way to create copies of objects, following the constructor pattern. This can make the code more readable and maintainable.
     *
     * Deep copy: In some cases, a class may contain complex data structures or references to other objects. A copy constructor can ensure that a deep copy is performed, correctly handling the copying of these internal objects, whereas a normal method may not handle this as expected, resulting in shallow copies or shared references.
     *
     * Encapsulation: A copy constructor allows you to keep the copying logic within the class itself, preserving the encapsulation of the class. This is beneficial for maintenance and ensuring that the class's internal state is correctly managed.
     *
     * Ease of use: A copy constructor is automatically called when an object is initialized with another object of the same class, making it easy to use without having to call a separate method for copying.
     *
     * Control over copying: A copy constructor gives you more control over how the copying process should be performed, allowing you to handle specific cases that may require special treatment or optimizations.
     */

  /*  public Shape copiar(Shape shape){
      if (shape instanceof Circle){
            Circle circle = (Circle) shape;
            circle.setRadius(circle.getRadius());
            circle.setColor(circle.getColor());
            circle.setX(circle.getX());
            circle.setY(circle.getY());
        }
    }*/






}
