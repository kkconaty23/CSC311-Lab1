package org.example;

/**
 * Car class
 */
public class Car extends Vehicle {
    String brand;

    /**
     * no parameter constructor
     */
    public Car(){
        super();
    }

    /**
     * paramter constructor that also uses the Vehicle construct and adds the brand
     * @param numberOfWheels
     * @param color
     * @param engineSize
     * @param fuelType
     * @param brand
     */
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    /**
     * get brand of car
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set the brand of the car
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * void method to simulate honking a car
     */
    public void honk(){
        System.out.println("Honk, honk!");
    }

    /**
     * void method to display the info of a car in the terminal
     */
    public void displayInfo(){
        System.out.println("The car is a "+ color +" " + brand + " with " + numberOfWheels+" wheels.");
        System.out.println("It has " + engineSize + " cylinders and uses "+ fuelType);
    }
}

