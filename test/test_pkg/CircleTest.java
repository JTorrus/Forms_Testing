package test_pkg;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;

public class CircleTest {
    private double defaultDelta = 0.1;

    @Test (expected = IllegalStateException.class)
    public void settingCirclesRadiusWithNegativeDoubleOrZeroThrowsIllegalStateException() {
        double radius = -5;
        new Circle(radius);
    }

    @Test
    public void calculatingCirclesAreaWithPositiveRadiusWorks() {
        double radius = 10;
        Circle circle = new Circle(radius);

        Assert.assertEquals(314.1592653589793, circle.getArea(), defaultDelta);
    }

    @Test
    public void calculatingCirclesPerimeterWithPositiveRadiusWorks() {
        double radius = 10;
        Circle circle = new Circle(radius);

        Assert.assertEquals(62.83185307179586, circle.getPerimeter(), defaultDelta);
    }
}
