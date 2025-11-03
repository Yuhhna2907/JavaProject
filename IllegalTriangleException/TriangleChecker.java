package IllegalTriangleException;

public class TriangleChecker {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("The input values are invalid");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("The sum of any two sides is not greater than the remaining side!");
        }
    }
}
