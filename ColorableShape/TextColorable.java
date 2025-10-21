package ColorableShape;

import Shapes.Circle;
import Shapes.Rectangle;

public class TextColorable {
    public static void main(String[] args) {
        System.out.println("=== Test Colorable ===");

        Object[] shapes = {
                new Circle(3),
                new Rectangle(4, 5),
                new Square(6)
        };

        for (Object obj : shapes) {
            if (obj instanceof Square) {
                Square s = (Square) obj;
                System.out.printf("Square area: %.2f%n", s.getArea());
                s.howToColor();
            } else if (obj instanceof Rectangle) {
                Rectangle r = (Rectangle) obj;
                System.out.printf("Rectangle area: %.2f%n", r.getArea());
            } else if (obj instanceof Circle) {
                Circle c = (Circle) obj;
                System.out.printf("Circle area: %.2f%n", c.getArea());
            }
        }
    }
}
