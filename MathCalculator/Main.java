package MathCalculator;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.addition(1, 2);
        System.out.println("1 + 2 = " + result);
        result = proxy.addition(2, Double.MAX_VALUE);
        System.out.println("2 + Double.MAX_VALUE = " + result);
    }
}
