package PointAndMoveAblePoint;

public class TextPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Point: " + p1);

        MoveAblePoint mp1 = new MoveAblePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Before move: " + mp1);

        mp1.move();
        System.out.println("After move: " + mp1);
    }
}
