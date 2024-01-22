package com.CollectionFrameWork;

import java.util.HashSet;

public class HashDemo2 {
    public static void main(String[] args) {


        System.out.println("---------------------------------------");
        System.out.println("Question number 44");

        // 44. Write a Java program to compare two hash set.
        HashSet<String> searchEngine = new HashSet<>();

        searchEngine.add("Chrome");
        searchEngine.add("FireFox");
        searchEngine.add("Edge");

        HashSet<String> google = new HashSet<>();

        google.add("Chrome");
        google.add("FireFox");
        google.add("Edge");
        google.add("yahoo");

        boolean isValid = google.equals(searchEngine);

        if (isValid) {
            System.out.println("Hash set are equal. ");
        } else {
            System.out.println("Hash set are not equal.");
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 45");
        // 45. Write a Java program to compare two sets and retain elements which are the same on both sets.

        HashSet<String> common = new HashSet<>(searchEngine);
        common.retainAll(google);
        System.out.println(common);

        System.out.println("---------------------------------------");
        System.out.println("Question number 46");

        // 46. Write a Java program to remove all the elements from a hash set.
        searchEngine.clear();
        System.out.println(searchEngine);


        System.out.println(google);
    }
}