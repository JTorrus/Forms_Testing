package test_pkg;

public class Rectangle extends Form {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    double getArea() {
        return base * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (base + height);
    }
}
