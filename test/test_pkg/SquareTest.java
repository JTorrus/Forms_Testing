package test_pkg;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    private final double DEFAULT_DELTA = 0.1;
    private final double TEST_AREA = 100;
    private final double TEST_PERIMETER = 40;

    @Test(expected = IllegalStateException.class)
    public void settingSquaresSideWithNegativeDoubleOrZeroThrowsIllegalStateException() {
        double side = -5;
        new Square(side);
    }

    @Test
    public void calculatingRectanglesAreaWithPositiveDoublesWorks() {
        double side = 10;
        Square square = new Square(side);

        Assert.assertEquals(TEST_AREA, square.getArea(), DEFAULT_DELTA);
    }

    @Test
    public void calculatingRectanglesPerimeterWithPositiveDoublesWorks() {
        double side = 10;
        Square square = new Square(side);

        Assert.assertEquals(TEST_PERIMETER, square.getPerimeter(), DEFAULT_DELTA);
    }
}
