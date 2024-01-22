package com.CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeDemo1 {
    public static void main(String[] args) {

        //47. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> color = new TreeSet<>();

        System.out.println("Question number 47");

        color.add("Red");
        color.add("Blue");
        color.add("Brown");
        color.add("Violate");
        color.add("Green");
        System.out.println(color);

        System.out.println("---------------------------------------");
        System.out.println("Question number 48");
        //48. Write a Java program to iterate through all elements in a tree set.

        for(String colorNew : color){
            System.out.print(colorNew + " ");
        }

//        for (int i = 0; i<color.size();i++){
//            System.out.println(color.);
//        }
        System.out.println();

        System.out.println("---------------------------------------");
        System.out.println("Question number 49");
        //49. Write a Java program to add all the elements of a specified tree set to another tree set.

        HashSet<String> colorColor = new HashSet<>();
        colorColor.add("Indigo");
        colorColor.add("Purple");
        colorColor.add("Black");
        colorColor.add("Marun");

        colorColor.addAll(color);
        System.out.println(colorColor);

        System.out.println("---------------------------------------");
        System.out.println("Question number 50");

        //50. Write a Java program to create a reverse order view of the elements contained in a given tree set.

        System.out.println(color);
        Iterator<String> reverse = color.descendingIterator();
        while(reverse.hasNext()){
            System.out.print(reverse.next() + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");
        System.out.println("Question number 51");


        //51. Write a Java program to get the first and last elements in a tree set.

        System.out.println(color.first());
        System.out.println(color.last());

        System.out.println("---------------------------------------");
        System.out.println("Question number 52");
        //52. Write a Java program to get the number of elements in a tree set.

        System.out.println(color.size());

        System.out.println("---------------------------------------");
        System.out.println("Question number 53");
        //53. Write a Java program to compare two tree sets.

        boolean isValid = color.equals(colorColor);

        if(isValid){
            System.out.println("Tree set are equal");
        }
        else {
            System.out.println("Not equal");
        }

    }
}