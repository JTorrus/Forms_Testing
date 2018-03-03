package test_pkg;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    private final double DEFAULT_DELTA = 0.1;
    private final double TEST_AREA = 600;
    private final double TEST_PERIMETER = 110;

    @Test(expected = IllegalStateException.class)
    public void settingRectanglesBaseWithNegativeDoubleOrZeroThrowsIllegalStateException() {
        double base = -5;
        double height = 10;
        new Rectangle(base, height);
    }

    @Test(expected = IllegalStateException.class)
    public void settingRectanglesHeightWithNegativeDoubleOrZeroThrowsIllegalStateException() {
        double height = -5;
        double base = 10;
        new Rectangle(base, height);
    }

    @Test
    public void calculatingRectanglesAreaWithPositiveDoublesWorks() {
        double base = 15;
        double height = 40;
        Rectangle rectangle = new Rectangle(base, height);

        Assert.assertEquals(TEST_AREA, rectangle.getArea(), DEFAULT_DELTA);
    }

    @Test
    public void calculatingRectanglesPerimeterWithPositiveDoublesWorks() {
        double base = 15;
        double height = 40;
        Rectangle rectangle = new Rectangle(base, height);

        Assert.assertEquals(TEST_PERIMETER, rectangle.getPerimeter(), DEFAULT_DELTA);
    }
}
