package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashDemo {
    public static void main(String[] args) {

        //35. Write a Java program to append the specified element to the end of a hash set.
        System.out.println("Question number 35");

        HashSet<String> google = new HashSet<>();

        google.add("Chrome");
        google.add("FireFox");
        google.add("Edge");

        String elementToAppend = "brave";
        if (google.add(elementToAppend)) {
            System.out.println("Append element in HashSet is complete ! ");
            google.add(elementToAppend);
            System.out.println("After append element is :   " + google);
        } else {
            System.out.println("Append element in HashSet is complete ! ");
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 36");

        //  36. Write a Java program to iterate through all elements in a hash list

        for (String name : google) {
            System.out.println(name);
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 37");

        // 37. Write a Java program to get the number of elements in a hash set.
        int size = google.size();
        System.out.println("The number of elements in HashSet names is : " + size);

        System.out.println("---------------------------------------");
        System.out.println("Question number 38");

        System.out.println("Empty !!!");

        /*
         38. Write a Java program to empty a hash set.
        google.clear();
        System.out.println("After empty the HashSet :   " + google);
         */
        System.out.println("---------------------------------------");
        System.out.println("Question number 39");


        //39. Write a Java program to test if a hash set is empty or not

        boolean isEmpty = google.isEmpty();
        if (isEmpty) {
            System.out.println("The hashSet is empty  !");
        } else {
            System.out.println("The hashSet is not empty  !");
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 40");

        //40. Write a Java program to clone a hash set to another hash set.

        HashSet<String> friends = new HashSet<>(google);
        System.out.println("The new cloned HashSet is : " + friends);

        System.out.println("---------------------------------------");
        System.out.println("Question number 41");

        //41. Write a Java program to convert a hash set to an array.


        String[] array = new String[google.size()];
        array = google.toArray(array);

        //displaying the array
        for (String name : array) {
            System.out.println(name);
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 42");

        //    42. Write a Java program to convert a hash set to a tree set.

        TreeSet<String> googleTree = new TreeSet<String>(google);
        System.out.println("TreeSet converted from HashSet is : " + googleTree);

        System.out.println("---------------------------------------");
        System.out.println("Question number 43");
        // 43. Write a Java program to convert a hash set to a List/ArrayList.


        ArrayList<String> arrayList = new ArrayList<String>(List.of(array));
        //showing element of index 1.
        System.out.println(arrayList.get(1));

        //showing elements of arrayList
        System.out.println(arrayList);

    }
}