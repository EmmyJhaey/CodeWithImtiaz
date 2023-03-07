package com.Lesson3.inheritanceLearning;

public class Bird extends Animal {

    public Bird(String name, int height, float weight){
        super(name, height, weight);
    }

    public static void fly(){
        System.out.println("Flying");
    }

}
