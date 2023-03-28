package com.Lesson4.loop_excersises;

public class BackwardLoop {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(letters.length());

        for (int i = letters.length()-1; i >= 0 ; i--) {
            System.out.println(letters.charAt(i));
        }
    }
}
