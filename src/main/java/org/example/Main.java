package org.example;

public class Main {
    public static void main(String[] args) {
        //instantiating a car and vehicle object
        Vehicle vehicle1 = new Vehicle(2,"orange",4, "gas");
        Car car1 = new Car(4, "blue", 6, "gas","Toyota");

        car1.honk(); //using the honk method
        car1.displayInfo(); //using the display info method
        System.out.println(vehicle1.getNumberOfWheels());
    }
}