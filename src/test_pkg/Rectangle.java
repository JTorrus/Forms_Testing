package test_pkg;

public class Rectangle extends Figure {
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
