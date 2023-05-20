package visitor.live.ui;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        //Canvas
        //Html
        //SVG


        //htmlRenderer.renderCircle1(new Circle());

        HTMLRendererVisitor htmlRendererVisitor = new HTMLRendererVisitor();
        List<Shape> shapes = new ArrayList<Shape>();
        for (Shape shape: shapes){
            shape.accept(htmlRendererVisitor);
        }





    }
}
