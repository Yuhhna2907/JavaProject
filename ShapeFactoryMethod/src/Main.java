//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new CircleFactory();
        Shape circle = shapeFactory.getShape();
        circle.draw();

        ShapeFactory shapeFactory1 = new RectangleFactory();
        Shape rectangle = shapeFactory1.getShape();
        rectangle.draw();

        ShapeFactory shapeFactory2 = new SquareFactory();
        Shape square = shapeFactory2.getShape();
        square.draw();
    }
}