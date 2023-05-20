package visitor.live.ui;

public interface Visitable {

    public void accept(ShapeVisitor shapeVisitor);
}
