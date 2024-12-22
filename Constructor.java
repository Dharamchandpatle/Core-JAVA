// Default Constructor 
// public class Constructor {
    
// }

// I am taking a example of object is a car 

import java.util.Scanner;

public class Constructor {
    String car_name , model , color ; 
    float price;

    void showDetails(){
        System.out.println("Car Name : " + car_name);
        System.out.println("Car Model : " + model);
        System.out.println("Car Color : " + color);
        System.out.println("Car Price : " + price);
        
    }

    // Non parameterized constructor
    public Constructor(){
        car_name = "Rolce Royce ";
        model = "2020";
        color = " black ";
        price = 1000000.0f;

    }

    // Parameterized constructor 
    public Constructor(String car_name , String model , String color , float price){
        this.car_name = car_name ;
        this.model = model ;
        this.color = color ;
        this.price = price ;

    }

    public static void main(String[] args) {

        System.out.println("Creating same types of car ");
        Constructor car1 = new Constructor();
        car1.showDetails();
        Constructor car2 = new Constructor();
        car2.showDetails();

        System.out.println("Creating different types of car ");

        Constructor car3 = new Constructor("tesla ", "2024", "black " , 3.5f);
        car3.showDetails();

        Constructor car4 = new Constructor("Farari", "2024", "red " , 3.5f);
        car3.showDetails();

        // System.out.println("Creating different types of car ");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your car name : ");
        // String car_name = sc.next();
        // System.out.println("Enter your car model : ");
        // String model = sc.next();
        // System.out.println("Enter your car color : ");
        // String color = sc.next();
        // System.out.println("Enter your car price : ");
        // float price = sc.nextFloat();

        // Constructor car3 = new Constructor( car_name , model , color , price);
        // car3.showDetails();

       


    }
}
