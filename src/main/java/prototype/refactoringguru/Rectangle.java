package prototype.refactoringguru;

public class Rectangle extends Shape {


    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    protected Rectangle(Rectangle target) {
        super(target);
        this.width = target.width;
        this.height = target.height;
    }

    @Override
    public Shape cloneObject() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle that = (Rectangle) o;
        return width == that.width && height == that.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}' + " "+  super.toString();
    }
}
