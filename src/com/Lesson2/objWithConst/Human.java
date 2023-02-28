package com.Lesson2.objWithConst;

public class Human {

    String name;
    float height;
    byte age;

    public Human(String name, float height, byte age){
        this.name = name;
        this.height = height;
        this.age =  age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void walk(){
        System.out.println(name + " is walking");
    }

    //return function
    public String eat(){
        return name + " is eating";
    }
}
