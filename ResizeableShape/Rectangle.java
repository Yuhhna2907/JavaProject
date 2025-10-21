package ResizeableShape;

public class Rectangle implements Resizeable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        height += height * percent / 100;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Rectangle (width=%.2f, height=%.2f)", width, height);
    }
}
