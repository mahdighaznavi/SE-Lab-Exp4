package prototype;

public class Circle extends Shape {
    private int radius;

    private Circle(Circle circle) {
        this.color = circle.getColor();
        this.radius = circle.getRadius();
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle copy() {
        return new Circle(this);
    }
}
