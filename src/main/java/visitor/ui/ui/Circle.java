package visitor.ui.ui;

import visitor.ui.ShapeVisitor;
import visitor.ui.Visitable;

public class Circle implements Visitable {
    public int getCx() {
        return 0;
    }

    public int getCy() {
        return 0;
    }

    public int getRadius() {
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
