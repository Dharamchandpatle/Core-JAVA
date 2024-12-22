import java.util.Scanner;

public class Constructor1 {
    String car_name, model, color;
    float price;

    // Method to show car details
    void showDetails() {
        System.out.println("Car Name : " + car_name);
        System.out.println("Car Model : " + model);
        System.out.println("Car Color : " + color);
        System.out.println("Car Price : " + price);
    }

    // Non-parameterized constructor (Default Constructor)
    public Constructor1() {
        car_name = "Rolls Royce";
        model = "2020";
        color = "Black";
        price = 1000000.0f;
    }

    // Parameterized constructor
    public Constructor1(String car_name, String model, String color, float price) {
        this.car_name = car_name;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of cars as input
        System.out.println("Enter the number of cars: ");
        int n = sc.nextInt();

        // Creating an array of Constructor objects to hold details of 'n' cars
        Constructor1[] cars = new Constructor1[n];

        // Looping to take input for each car
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for car " + (i + 1) + ":");

            System.out.println("Enter car name: ");
            String car_name = sc.next();
            System.out.println("Enter car model: ");
            String model = sc.next();
            System.out.println("Enter car color: ");
            String color = sc.next();
            System.out.println("Enter car price: ");
            float price = sc.nextFloat();

            // Creating a new car object using the parameterized constructor
            cars[i] = new Constructor1(car_name, model, color, price);
        }

        // Displaying details for all cars
        System.out.println("\nCar details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of car " + (i + 1) + ":");
            cars[i].showDetails();
        }
    }
}
