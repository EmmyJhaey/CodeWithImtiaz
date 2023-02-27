package com.objWithConst;

public class Human {

    String name;
    float height;
    byte age;

    public Human(String name, float height, byte age){
        this.name = name;
        this.height = height;
        this.age =  age;
    }

    public void walk(){
        System.out.println(name + " is walking");
    }

    //return function
    public String eat(){
        return name + " is eating";
    }
}
