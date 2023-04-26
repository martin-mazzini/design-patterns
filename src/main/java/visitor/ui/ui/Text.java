package visitor.ui.ui;

import visitor.ui.ShapeVisitor;
import visitor.ui.Visitable;

public class Text implements Visitable {
    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int getStyle() {
        return 0;
    }

    public int getContent() {
        return 0;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
