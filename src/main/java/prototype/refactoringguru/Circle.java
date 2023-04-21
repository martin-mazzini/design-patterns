package prototype.refactoringguru;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    protected Circle(Circle target) {
        super(target);
        this.radius = target.radius;
    }

    @Override
    public Shape cloneObject() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + " "+ super.toString();
    }
}
