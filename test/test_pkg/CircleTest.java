package test_pkg;

import org.junit.Test;
import org.junit.Assert;

public class CircleTest {
    private final double DEFAULT_DELTA = 0.1;
    private final double TEST_AREA = 314.1592653589793;
    private final double TEST_PERIMETER = 62.83185307179586;

    @Test (expected = IllegalStateException.class)
    public void settingCirclesRadiusWithNegativeDoubleOrZeroThrowsIllegalStateException() {
        double radius = -5;
        new Circle(radius);
    }

    @Test
    public void calculatingCirclesAreaWithPositiveDoubleWorks() {
        double radius = 10;
        Circle circle = new Circle(radius);

        Assert.assertEquals(TEST_AREA, circle.getArea(), DEFAULT_DELTA);
    }

    @Test
    public void calculatingCirclesPerimeterWithPositiveDoubleWorks() {
        double radius = 10;
        Circle circle = new Circle(radius);

        Assert.assertEquals(TEST_PERIMETER, circle.getPerimeter(), DEFAULT_DELTA);
    }
}
