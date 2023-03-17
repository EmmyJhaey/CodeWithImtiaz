package com.Lesson5.car_dealership;

public class Dealership {
    public static void main(String[] args) {
            Customers customer1 = new Customers();
            customer1.setName("Tonny");
            customer1.setAddress("123 Avenue");
            customer1.setAmountOnHand(12_000_000);

            Vehicle vehicle1 = new Vehicle();
            vehicle1.setBrand("Benz");
            vehicle1.setColor("Black");
            vehicle1.setModel("GLK360");
            vehicle1.setPrice(15_000_000);

            Employee employee = new Employee();
            employee.setName("Georgia");

            customer1.purchaseCar(vehicle1, employee, false);
    }
}
