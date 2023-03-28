package com.Lesson6.learningExceptions;

import com.Lesson6.learningExceptions.exceptions.myExceptionsClass;

import java.io.File;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try{
            File file = new File("randomText.txt");
            Scanner readFile = new Scanner(file);

            while(readFile.hasNextLine()){
                String textInFile = readFile.nextLine();
                System.out.println(textInFile);
            }
            System.out.println("End------------");
            readFile.close();

        }catch(Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }


        myExceptionsClass myExceptionsClass = new myExceptionsClass();
        try{
            System.out.println(myExceptionsClass.subtract10FromInput(2));
        }catch (Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }

    }

}
