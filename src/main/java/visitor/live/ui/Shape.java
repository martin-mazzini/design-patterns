package visitor.live.ui;
//VISITABLE
public interface Shape {

    public void renderHTML();

    public void accept(ShapeVisitor shapeVisitor);
}
