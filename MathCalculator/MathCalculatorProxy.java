package MathCalculator;

public class MathCalculatorProxy implements Calculator{
    private final MathCalculator mathCalculator;
    public MathCalculatorProxy(){
        this.mathCalculator = new MathCalculator();
    }
    @Override
    public double addition(double first, double second) {
        if(first / 2 + second / 2 >= Double.MAX_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        if(first / 2 + second / 2 <= Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.addition(first, second);
    }


    @Override
    public double subtract(double first, double second) {
        if(first / 2 - second / 2 >= Double.MAX_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        if(first / 2 - second / 2 <= Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.subtract(first, second);
    }

    @Override
    public double multiply(double first, double second) {
        double result = mathCalculator.multiply(first, second);
        if(first != 0 && result / first != second){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double divide(double first, double second) {
        if(second == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return mathCalculator.divide(first, second);
    }
}
