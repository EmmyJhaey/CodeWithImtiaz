package com.Lesson3.inheritanceLearning;

public class Fish extends Animal {

    public Fish(String name, int height, float weight) {
        super(name, height, weight);
    }

    public static void swim(){
         System.out.println("Swimming");
     }
}
