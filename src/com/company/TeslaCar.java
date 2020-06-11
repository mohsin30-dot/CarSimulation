package com.company;


public class TeslaCar extends Car {

    String model;

    TeslaCar(String engine, int doors, String name) {
        super(engine, doors, name);

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine(String engine, int doors, String name) {
        // inhering wheels from parent class
        System.out.println(
                "Started with " + "Engine:" + engine + " Door:" + doors + " Name:" + name + " Wheels:" + wheels);
    }

    public void beep() {
        System.out.println("BEEP");
    }

    public void printModel(String model) {
        System.out.println("Model:" + model);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TeslaCar car = new TeslaCar("V6 Electric", 4, "TESLA");
        car.setModel("model 3");
        car.startEngine(car.getEngine(), car.getDoors(), car.getName());
        car.printModel(car.getModel());
        car.beep();
        car.accelerate();
        car.brake();
    }

}
