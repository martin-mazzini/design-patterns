package prototype.refactoringguru;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {


        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(10, 20, "red", 5);
        Rectangle rectangle = new Rectangle(10, 40, "green", 10, 5);

        shapes.add(rectangle);
        shapes.add(circle);

        cloneAndCompare(shapes);
    }

    private static void cloneAndCompare(List<Shape> shapes) {

        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.cloneObject());
        }

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Shape " + i + " = " + shapes.get(i).toString());
        }
    }
}

