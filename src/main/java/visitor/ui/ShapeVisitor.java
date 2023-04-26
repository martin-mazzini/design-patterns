package visitor.ui;

import visitor.ui.ui.Circle;
import visitor.ui.ui.Line;
import visitor.ui.ui.Rectangle;
import visitor.ui.ui.Text;

public interface ShapeVisitor {
    void visit(Rectangle rectangle);
    void visit(Circle circle);
    void visit(Line line);
    void visit(Text text);
}
