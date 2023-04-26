package visitor.ui;

import visitor.ui.ui.Circle;
import visitor.ui.ui.Line;
import visitor.ui.ui.Rectangle;
import visitor.ui.ui.Text;

class SVGRenderVisitor implements ShapeVisitor {
    private StringBuilder svgData;

    public SVGRenderVisitor() {
        this.svgData = new StringBuilder();
        this.svgData.append("<svg xmlns=\"http://www.w3.org/2000/svg\">");
    }

    public String getSvgData() {
        return svgData.append("</svg>").toString();
    }

    @Override
    public void visit(Rectangle rectangle) {
        svgData.append("<rect x=\"").append(rectangle.getX())
                .append("\" y=\"").append(rectangle.getY())
                .append("\" width=\"").append(rectangle.getWidth())
                .append("\" height=\"").append(rectangle.getHeight())
                .append("\" style=\"").append(rectangle.getStyle())
                .append("\" />");
    }

    @Override
    public void visit(Circle circle) {
        svgData.append("<circle cx=\"").append(circle.getCx())
                .append("\" cy=\"").append(circle.getCy())
                .append("\" r=\"").append(circle.getRadius())
                .append("\" style=\"").append(circle.getStyle())
                .append("\" />");
    }

    @Override
    public void visit(Line line) {
        svgData.append("<line x1=\"").append(line.getX1())
                .append("\" y1=\"").append(line.getY1())
                .append("\" x2=\"").append(line.getX2())
                .append("\" y2=\"").append(line.getY2())
                .append("\" style=\"").append(line.getStyle())
                .append("\" />");
    }

    @Override
    public void visit(Text text) {
        svgData.append("<text x=\"").append(text.getX())
                .append("\" y=\"").append(text.getY())
                .append("\" style=\"").append(text.getStyle())
                .append("\">").append(text.getContent())
                .append("</text>");
    }
}
