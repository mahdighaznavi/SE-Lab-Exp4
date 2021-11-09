package prototype;

public class Rectangle extends Shape{
    private int width, height;

    private Rectangle(Rectangle rectangle){
        this.color = rectangle.getColor();
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    public Rectangle(){

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public Rectangle copy() {
        return new Rectangle(this);
    }
}
