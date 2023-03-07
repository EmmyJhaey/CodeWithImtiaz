package com.Lesson3.abstractLearning;
public class Sparrow extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Moving both wings to get higher");
    }
}
