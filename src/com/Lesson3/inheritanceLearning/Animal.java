package com.Lesson3.inheritanceLearning;

public class Animal {

    static String name;
    static int height;
    static float weight;

    public  Animal(String name, int height,  float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static void eat(){
        System.out.println("eating");
    }

    public static void walk(){
        System.out.println("walking");
    }

}
