package com.Lesson5.car_dealership;

import java.text.NumberFormat;

public class Employee {
    
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public  void handleCustomer(Customers customer, boolean finance, Vehicle vehicle){
        if (finance == true)
            runCreditHistoryForLoanAmount(customer, vehicle);
        else if(customer.amountOnHand >= vehicle.getPrice())
                processTransaction(customer, vehicle);
        else
            System.out.println("Customer will need more money to purchase " + vehicle.getBrand());
    }
    public  void runCreditHistoryForLoanAmount(Customers cust, Vehicle vehicle){
        double loanAmount = vehicle.getPrice() - cust.amountOnHand;
        System.out.println(cust.name + " has been loaned a sum of " + NumberFormat.getCurrencyInstance().format(loanAmount));
        System.out.println(cust.name + " has Successfully purchased " + vehicle.getBrand() + " for the sum of " + NumberFormat.getCurrencyInstance().format(vehicle.price));
    }

    public void processTransaction(Customers customer, Vehicle vehicle){
        System.out.println(customer.name + " has Successfully purchased " + vehicle.getBrand() + " for the sum of " + NumberFormat.getCurrencyInstance().format(vehicle.price));
    }
}
