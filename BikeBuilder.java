package com.BuilderDesignPattern;

public class BikeBuilder {

    private String company;
    private int topSpeed;
    private String model;
    private double size;
    private int milage;

    public BikeBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public BikeBuilder setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public BikeBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public BikeBuilder setSize(double size) {
        this.size = size;
        return this;
    }

    public BikeBuilder setMilage(int milage) {
        this.milage = milage;
        return this;
    }

    public Bike getBike(){
        return new Bike(company,topSpeed,model,size,milage);
    }
}
