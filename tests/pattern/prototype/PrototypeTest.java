package pattern.prototype;

import org.junit.Assert;
import org.junit.Test;
import prototype.Circle;
import prototype.Color;
import prototype.Rectangle;


public class PrototypeTest {
    @Test
    public void clone_rectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(2);
        rectangle.setColor(Color.BLUE);
        Rectangle rectangle1 = rectangle.copy();
        Assert.assertEquals(rectangle.getWidth(), rectangle1.getWidth());
        Assert.assertEquals(rectangle.getHeight(), rectangle1.getHeight());
        Assert.assertEquals(rectangle.getColor(), rectangle1.getColor());
    }

    @Test
    public void clone_circle() {
        Circle circle = new Circle();
        circle.setRadius(2);
        circle.setColor(Color.RED);
        Circle circle1 = circle.copy();
        Assert.assertEquals(circle.getRadius(), circle1.getRadius());
        Assert.assertEquals(circle.getColor(), circle1.getColor());
    }
}
