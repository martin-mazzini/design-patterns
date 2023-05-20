package visitor.live.ui;

public class HTMLRendererVisitor implements ShapeVisitor {


    @Override
    public void visitCircle(Circle circle) {
        int radius = circle.getRadius();
        //String html de un circulo
    }

    @Override
    public void renderLine(Line line) {

    }

    @Override
    public void renderRectangle(Rectangle rectangle) {

    }

    @Override
    public void renderText(Text text) {

    }
}
