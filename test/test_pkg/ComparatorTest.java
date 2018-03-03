package test_pkg;

import org.junit.Assert;
import org.junit.Test;

public class ComparatorTest {
    private Comparator comparator = new Comparator();

    @Test
    public void ifFirstFigureAreaIsGreaterThanSecondOneItShouldReturnIntegerOne() {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);

        Assert.assertEquals(1, comparator.compareArea(circle, rectangle));
    }

    @Test
    public void ifFirstFigureAreaIsLowerThanSecondOneItShouldReturnIntegerOneNegative() {
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(40);

        Assert.assertEquals(-1, comparator.compareArea(rectangle, square));
    }

    @Test
    public void ifFirstFigurePerimeterIsGreaterThanSecondOneItShouldReturnIntegerOne() {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);

        Assert.assertEquals(1, comparator.comparePerimeter(circle, rectangle));
    }

    @Test
    public void ifFirstFigurePerimeterIsLowerThanSecondOneItShouldReturnIntegerOneNegative() {
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(40);

        Assert.assertEquals(-1, comparator.comparePerimeter(rectangle, square));
    }

    @Test
    public void ifFirstFigureAreaIsEqualToSecondOneItShouldReturnIntegerZero() {
        Rectangle rectangle = new Rectangle(800, 2);
        Square square = new Square(40);

        Assert.assertEquals(0, comparator.compareArea(rectangle, square));
    }

    @Test
    public void ifFirstFigurePerimeterIsEqualToSecondOneItShouldReturnIntegerZero() {
        Rectangle rectangle = new Rectangle(40, 40);
        Square square = new Square(40);

        Assert.assertEquals(0, comparator.comparePerimeter(rectangle, square));
    }
}
