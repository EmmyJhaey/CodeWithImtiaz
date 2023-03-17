package com.Lesson5.car_dealership;

public class Customers {

            String name;
            String address;
            double amountOnHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String appendToAddress  = " Dealership City";
        this.address = address + appendToAddress;
    }

    public double getAmountOnHand() {
        return amountOnHand;
    }

    public void setAmountOnHand(double amountOnHand) {
        this.amountOnHand = amountOnHand + 1000;
    }

    public  void purchaseCar(Vehicle vehicle, Employee employee, boolean finance){
        employee.handleCustomer( this, finance, vehicle);
    }

}
