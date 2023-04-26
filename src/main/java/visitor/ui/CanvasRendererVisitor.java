package visitor.ui;

import visitor.ui.ui.Circle;
import visitor.ui.ui.Line;
import visitor.ui.ui.Rectangle;
import visitor.ui.ui.Text;

class CanvasRendererVisitor implements ShapeVisitor {


    @Override
    public void visit(Rectangle rectangle) {

    }

    @Override
    public void visit(Circle circle) {
    }

    @Override
    public void visit(Line line) {
    }

    @Override
    public void visit(Text text) {

    }
}


