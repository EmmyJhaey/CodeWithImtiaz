package com.Lesson6.learningExceptions.exceptions;

public class myExceptionsClass{

    public int subtract10FromInput(int digit)throws Exception{
        if(digit < 10)
            throw new Exception("Enter a digit more than 10");

        return digit-10;
    }

}
