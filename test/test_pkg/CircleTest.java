package test_pkg;

import org.junit.Test;
import org.junit.Assert;

public class CircleTest {
    @Test (expected = IllegalStateException.class)
    public void settingCirclesAreaWithNegativeDoubleThrowsIllegalStateException() {
        double area = -5;
        try {
            new Circle(area);
        } catch (IllegalStateException ignore) {}

        Assert.fail();
    }
}
