package visitor.live.ui;

public interface ShapeVisitor {



    public void visitCircle(Circle circle);
    public void renderLine(Line line);
    public void renderRectangle(Rectangle rectangle);
    public void renderText(Text text);








}
