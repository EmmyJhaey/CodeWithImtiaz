package com.Lesson3.abstractLearning;

public class Zoo {
    public static void main(String[] args) {
        Animal sparrow1 = new Sparrow();
        Fish fish1 = new Fish();

        moveAnimal(sparrow1);
        moveAnimal(fish1);

    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }

}
