package ResizeableShape;
import java.util.Random;

public class TextResizeable {
    public static void main(String[] args) {
        Random random = new Random();

        Resizeable[] shapes = new Resizeable[] {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(5)
        };

        for (Resizeable shape : shapes) {
            double before = shape.getArea();
            double percent = 1 + random.nextInt(100); 
            shape.resize(percent);
            double after = shape.getArea();

            System.out.printf("%s | Resize: %.0f%% | Area before: %.2f | Area after: %.2f%n",
                    shape.getClass().getSimpleName(), percent, before, after);
        }
    }
}
