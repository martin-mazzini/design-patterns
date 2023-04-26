package visitor.ui.ui;

import visitor.ui.ShapeVisitor;
import visitor.ui.Visitable;

public class Line  implements Visitable {
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
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
