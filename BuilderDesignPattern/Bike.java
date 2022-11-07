package com.BuilderDesignPattern;

public class Bike {

    private String company;
    private int topSpeed;
    private String model;
    private double size;
    private int milage;

    public Bike(String company, int topSpeed, String model, double size, int milage) {
        this.company = company;
        this.topSpeed = topSpeed;
        this.model = model;
        this.size = size;
        this.milage = milage;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "company='" + company + '\'' +
                ", topSpeed=" + topSpeed +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", milage=" + milage +
                '}';
    }
}
