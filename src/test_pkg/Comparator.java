package test_pkg;

class Comparator {
    int compareArea(Figure figureOne, Figure figureTwo) {
        if (figureOne.getArea() > figureTwo.getArea()) {
            return 1;
        } else if (figureOne.getArea() < figureTwo.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    int comparePerimeter(Figure figureOne, Figure figureTwo) {
        if (figureOne.getPerimeter() > figureTwo.getPerimeter()) {
            return 1;
        } else if (figureOne.getPerimeter() < figureTwo.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
