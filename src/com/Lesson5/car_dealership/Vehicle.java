package com.Lesson5.car_dealership;

public class Vehicle {

    String brand;
    String model;
    String color;
    double price;

//    public Vehicle(String brand, String model, String color,  double price){
//        this.brand = brand;
//        this.model = model;
//        this.color = color;
//        this.price = price;
//    }

    public String getBrand(){
        return  brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
