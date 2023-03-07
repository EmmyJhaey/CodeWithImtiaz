package com.Lesson3.inheritanceLearning;

public class Zoo {

    public static void main(String[] args) {

        Bird bird1 = new Bird("Larry", 4, 6F);
        bird1.walk();
        bird1.eat();
        System.out.printf("%s%s%n%s%d%n%s%f", "Bird Name: ", bird1.name, "Bird height: ", bird1.height, "Bird Weight: ", bird1.weight);


    }

}
