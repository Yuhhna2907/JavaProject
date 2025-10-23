package TriangleClassifier;

public class TriangleClassifier {
    public static String classifyTriangle(int sideA, int sideB, int sideC) {
        if (!isValidTriangle(sideA, sideB, sideC)) {
            return "Không phải là tam giác";
        }

        if (isEquilateral(sideA, sideB, sideC)) {
            return "Tam giác đều";
        }

        if (isIsosceles(sideA, sideB, sideC)) {
            return "Tam giác cân";
        }

        return "Tam giác thường";
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 &&
                (a + b > c) &&
                (a + c > b) &&
                (b + c > a);
    }

    private static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isIsosceles(int a, int b, int c) {
        return a == b || a == c || b == c;
    }
}

