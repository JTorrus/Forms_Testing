package test_pkg;

class Square extends Figure {
    private double side;

    Square(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    double getPerimeter() {
        return side * 4;
    }
}
