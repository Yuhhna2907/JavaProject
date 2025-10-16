import java.util.Scanner;

public class RectangleClass {
    double width;
    double height;
    public RectangleClass() {
    }
    public RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = input.nextDouble();
        System.out.println("Enter the height:");
        double height = input.nextDouble();
        RectangleClass r = new RectangleClass(width, height);
        System.out.println(" Your rectangle is:\n " + r.display());
        System.out.println("Perimeter is: " + r.getPerimeter());
        System.out.println("Area is: " + r.getArea());
    }
}
