package com.Lesson4;

public class StringLearning {
    public static void main(String[] args) {
        int digit = 6;
        String word = "init";

        System.out.println(word.length());
        for (int counter = 0; counter <= word.length() -1; counter ++){
            System.out.println(word.charAt(counter));
        }
    }
}
