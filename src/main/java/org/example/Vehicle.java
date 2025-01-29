package org.example;

/**
 * Vehicle class
 */
public class Vehicle {
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;

    /**
     * parameterless constructor
     */
    public Vehicle(){

    }

    /**
     * constructor with parameters
     * @param numberOfWheels
     * @param color
     * @param engineSize
     * @param fuelType
     */
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType ) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    /**
     * Getter methods for the car class
     * @return
     */
    public int getNumberOfWheels() {return numberOfWheels;}

    public String getColor() {return color;}

    public float getEngineSize() {return engineSize;}

    public String getFuelType() {return fuelType;}

    /**
     * setter method
     * @param numberOfWheels
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * setter method
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * setter method
     * @param engineSize
     */
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    /**
     * setter method
     * @param fuelType
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}


