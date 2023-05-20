package visitor.live.ui;

public class Line implements Shape, Visitable {
    public int getX1() {
        return 0;
    }

    public int getY1() {
        return 0;
    }

    public int getX2() {
        return 0;
    }

    public int getY2() {
        return 0;
    }

    public int getStyle() {
        return 0;
    }


    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.renderLine(this);
    }


























    @Override
    public void renderHTML() {

    }
}
