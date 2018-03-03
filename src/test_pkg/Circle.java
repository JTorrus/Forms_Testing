package test_pkg;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
