package com.company;

public class Car {
    String engine;
    int doors;
    final int wheels = 4;

    String name;

    Car(String engine, int doors, String name) {
        this.engine = engine;
        this.doors = doors;
        this.name = name;
    }

    // getters & Setters

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Create generic class

    public void startEngine() {
        System.out.println("Engine Started ");
    }

    public void accelerate() {
        System.out.println("Accelerate a car safely");
    }

    public void brake() {
        System.out.println("Push brake smoothly");
    }

    public void fuel() {
        System.out.println("Synthetic fuel");
    }

    public void mileage() {
        System.out.println("Maximum mileage of car");
    }
}
