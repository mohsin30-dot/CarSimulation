package com.company;


public class BmwCar extends Car {

    String model;

    BmwCar(String engine, int doors, String name) {
        super(engine, doors, name);

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

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
        BmwCar car = new BmwCar("V6", 4, "BMW");
        car.setModel("X5");
        car.startEngine(car.getEngine(), car.getDoors(), car.getName());
        car.printModel(car.getModel());
        car.beep();
        car.accelerate();
        car.brake();
    }

}

