package CalculationExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number x:");
        int x = input.nextInt();
        System.out.println("Enter the number y:");
        int y = input.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }
}
