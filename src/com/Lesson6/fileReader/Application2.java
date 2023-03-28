package com.Lesson6.fileReader;

class MyAutoCloseable implements  AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
    }
}
public class Application2{

    public static void main(String[] args) {
        MyAutoCloseable myAutoCloseable = new MyAutoCloseable();

       try{
           myAutoCloseable.close();
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }

}
