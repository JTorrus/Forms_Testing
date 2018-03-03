package test_pkg;

class Rectangle extends Figure {
    private double base;
    private double height;

    Rectangle(double base, double height) {
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
