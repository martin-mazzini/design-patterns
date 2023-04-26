package visitor.ui.ui;

import visitor.ui.ShapeVisitor;
import visitor.ui.Visitable;

import java.awt.*;

public class Rectangle implements Visitable {
    public BasicStroke getStyle() {
        return null;
    }


    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
