package CalculationExample;

public class CalculationExample {
    public void calculate(int x, int y) {
        try {
            int sum = x + y;
            int sub = x - y;
            int mul = x * y;
            int div = x / y;
            System.out.println("The sum is: " + sum);
            System.out.println("The sub is: " + sub);
            System.out.println("The mul is: " + mul);
            System.out.println("The div is: " + div);
        } catch (ArithmeticException e) {
            System.out.println("The math is error: " + e.getMessage());
        }
    }
}
