package src.main;

import src.main.models.Car;
import src.main.models.Dealership;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();

        dealership.addCar(new Car("Volvo", "Purple")); //kan lägga till
        dealership.addCar(new Car("Tesla", "Black")); 
        dealership.sellCar(new Car("Tesla", "Black")); //kan sälja

        System.out.println(dealership); //kan skriva ut alla 

    }
}
