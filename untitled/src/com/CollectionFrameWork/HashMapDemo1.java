package com.CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        //74. Write a Java program to associate the specified value with the specified key in a HashMap.
        hashMap.put(1, "Diwash");
        hashMap.put(2, "pokhrel");
        hashMap.put(3, "pokhrel");
        System.out.println(hashMap);

        //75. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("Size of hash map is " + hashMap.size());


        //76. Write a Java program to copy all the mappings from the specified map to another map.
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.putAll(hashMap);
        System.out.println("Original Source Map: " + hashMap);
        System.out.println("Copied Destination Map: " + hashMap1);

        //77. Write a Java program to remove all the mappings from a map.
        hashMap1.clear();
        System.out.println("Removed Map: " + hashMap1);

        //78. Write a Java program to check whether a map contains key-value mappings (empty) or not.d
        boolean isEmpty = hashMap.isEmpty();

        if (isEmpty) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty. It contains key-value mappings.");
        }
    }
}
