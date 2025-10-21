package ResizeableShape;

public class Circle implements Resizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent / 100;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Circle (radius=%.2f)", radius);
    }
}
