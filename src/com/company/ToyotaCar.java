package com.company;


public class ToyotaCar extends Car {

    String model;

    ToyotaCar(String engine, int doors, String name) {
        super(engine, doors, name);

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // polymorphism -- override parent methods

    public void startEngine(String engine, int doors, String name) {
        System.out.println("Started with " + "Engine:" + engine + " Door:" + doors + " Name:" + name);
    }

    public void beep() {
        System.out.println("BEEP");
    }

    public void printModel(String model) {
        System.out.println("Model:" + model);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ToyotaCar car = new ToyotaCar("V4", 4, "Toyota");
        car.setModel("Corolla");
        car.startEngine(car.getEngine(), car.getDoors(), car.getName());
        car.printModel(car.getModel());
        car.beep();
        // Inheritance - by calling parent method
        car.accelerate();
        car.brake();
    }
}

