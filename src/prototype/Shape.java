package prototype;

public abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract Shape copy();
}
