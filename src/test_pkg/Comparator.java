package test_pkg;

class Comparator {
    private Figure figureOne;
    private Figure figureTwo;

    public Comparator(Figure figureOne, Figure figureTwo) {
        this.figureOne = figureOne;
        this.figureTwo = figureTwo;
    }

    void compareArea(Figure figureOne, Figure figureTwo) {
        if (figureOne.getArea() > figureTwo.getArea()) {

        } else if (figureOne.getArea() < figureTwo.getArea()) {

        } else {

        }
    }

    void comparePerimeter(Figure figureOne, Figure figureTwo) {
        if (figureOne.getPerimeter() > figureTwo.getPerimeter()) {

        } else if (figureOne.getPerimeter() < figureTwo.getPerimeter()) {

        } else {

        }
    }
}
