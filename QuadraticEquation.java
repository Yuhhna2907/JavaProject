import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b*b-4*a*c;
    }
    public double getRoot1(){
        double delta= getDiscriminant();
        if(delta>0){
            return (-b+Math.sqrt(delta))/(2*a);
        }
        else {
            return 0;
        }
    }
    public double getRoot2(){
        double delta= getDiscriminant();
        if(delta>0){
            return (-b-Math.sqrt(delta))/(2*a);
        }
        else {
            return 0;
        }
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a:");
            double a = input.nextDouble();
            System.out.println("Enter b:");
            double b = input.nextDouble();
            System.out.println("Enter c:");
            double c = input.nextDouble();
            QuadraticEquation q = new QuadraticEquation(a, b, c);
            double delta = q.getDiscriminant();
            if(delta>0){
                System.out.println("The equation has two roots:");
                System.out.println("Root1: " + q.getRoot1());
                System.out.println("Root2: " + q.getRoot2());
            }
            else if(delta==0) {
                System.out.println("The equation has one root:");
                System.out.println("Root: " + q.getRoot1());
            }else {
                System.out.println("The equation has no real root:");
            }

        }
    }

