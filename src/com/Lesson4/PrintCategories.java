package com.Lesson4;

public class PrintCategories {
    public static void main(String[] args) {
        String str = "We have a large inventory of things in our warehouse falling in the category:apperal and the slightly more in demand category:makeup" +
                " along with the category:furniture and....";

        printCategories(str);
    }

    public static void printCategories(String str){
        int counter = 0;
//        int found  = 0;
        while(true){
            int found = str.indexOf("category:", counter);
            if(found == -1)
                break;
            int start = found + 9 ;
            int end = str.indexOf(" ", found);
            System.out.println("Category: " + str.substring(start, end));
            counter = end;
        }

    }
}
