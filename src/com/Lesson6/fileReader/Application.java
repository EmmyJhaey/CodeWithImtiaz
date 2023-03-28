package com.Lesson6.fileReader;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        File file = new File("randomText.txt");
        try(FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while(line != null){
                line = bufferedReader.readLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read File " + file.getName());
        }
    }

}
