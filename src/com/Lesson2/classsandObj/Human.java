package com.Lesson2.classsandObj;
//Blueprint of how a human should be created
public class Human {
        //Physical Attributes of a Human
        static String  gender;
        static String hairColor;
        static String name;
        static float height;
        static float weight;



        public static void  setName(String name){
            Human.name = name;
        }
        public static String getName(){
            return name;
        }

        public static String getGender() {
        return gender;
    }

        public static void setGender(String gender) {
        Human.gender = gender;
    }

        public static String getHairColor() {
        return hairColor;
    }

        public static void setHairColor(String hairColor) {
        Human.hairColor = hairColor;
    }

        public static float getHeight() {
        return height;
    }

        public static void setHeight(float height) {
        Human.height = height;
    }

        public static float getWeight() {
        return weight;
    }

        public static void setWeight(float weight) {
        Human.weight = weight;
    }

        public static void eat(){
            System.out.println(name + " is eating");
        }

        public  static void walk(){
            System.out.println(name + " is walking");
        }

}
