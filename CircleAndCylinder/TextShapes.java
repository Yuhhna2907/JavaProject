package CircleAndCylinder;

public class TextShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0,"blue");
        System.out.println(circle.toString());

        Cylinder cylinder=new Cylinder(3.0,"green",5.0);
        System.out.println(cylinder.toString());

    }
}
