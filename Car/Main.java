package Car;

public class Main {
    public static void main(String[] args) {
        new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
