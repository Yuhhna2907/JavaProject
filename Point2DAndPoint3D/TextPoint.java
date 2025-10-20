package Point2DAndPoint3D;

public class TextPoint {
    public static void main(String[] args) {
        Point2D p2d=new Point2D(1.5f,2.5f);
        System.out.println("Point 2D:"+p2d);
        System.out.println("XY array: " + java.util.Arrays.toString(p2d.getXY()));

        Point3D p3d = new Point3D(3.5f, 4.5f, 5.5f);
        System.out.println("Point3D: " + p3d);
        System.out.println("XYZ array: " + java.util.Arrays.toString(p3d.getXYZ()));

        p3d.setXYZ(7.5f, 8.5f, 9.5f);
        System.out.println("After setXYZ: " + p3d);

    }
}
