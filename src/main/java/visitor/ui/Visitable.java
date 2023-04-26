package visitor.ui;

public interface Visitable {
    void accept(ShapeVisitor visitor);
}
