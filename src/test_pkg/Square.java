package test_pkg;

public class Square implements Form {
    private double side;

    public Square(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
