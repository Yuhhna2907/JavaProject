public class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
