package com.Lesson2.objWithConst;

public class Earth {
    public static void main(String[] args) {
        Human person1 = new Human("James", 6.5F,  (byte) 22);
        person1.walk();
        System.out.println(person1.eat());
    }
}
