package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colors {
    /*  1 .Write a Java program to create
     a new array list,
     add some colors (string)
     and print out the collection.
     */
    public static void main(String[] args) {
        //create a list
        System.out.println("Question number 1");

        List<String> color = new ArrayList<>();
        //adding element in list
        color.add("Red");
        color.add("Blue");
        color.add("Brown");
        color.add("Violate");
        color.add("Green");
        color.add("Indigo");
        color.add("Purple");
        color.add("Black");
        color.add("Marun");
        //display elements from list
        System.out.println(color);
        System.out.println("---------------------------------------");
        System.out.println("Question number 3");

        /*
        3. How will you reverse a List?
         */
        //reverse list
        Collections.reverse(color);
        System.out.print(color);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Question number 4");

        /*
        4. to iterate through all elements in an array list.
         */
        for (String iterate : color) {
            System.out.print(iterate + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Question number 5");

        /*
        5. to retrieve an element (at a specified index) from a given array list.
         */
        for(int i = 0;i<color.size();i++){
            System.out.println("elements of index "+ i +" is " +color.get(i));
        }
        System.out.println("---------------------------------------");
        System.out.println("Question number 6");

        /*
        6. to remove the third element from an array list.
         */
        color.remove(2);
        System.out.println("3rd item removed successfully !!!");
        System.out.println("Displaying colors after deleting 3rd item from list");
        System.out.println(color);
        System.out.println();
        System.out.println("---------------------------------------");
    }
}
