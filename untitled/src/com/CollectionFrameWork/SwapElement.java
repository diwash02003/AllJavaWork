package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SwapElement {
    public static void main(String[] args) {

        LinkedList<String> alpha = new LinkedList<>();

        // 18. Write a Java program of swap two elements in a linked list
        System.out.println("Question number 18");

        alpha.addLast("many");
        alpha.addLast("bro");
        alpha.addLast("bye");
        alpha.addLast("get");
        alpha.addLast("sid");

        System.out.println("Before swap");
        System.out.println(alpha);

        //swap process

        int position1 = 0;    // index based
        int position2 = alpha.size() - 1;

        String temp = alpha.get(position1);
        alpha.set(position1, alpha.get(position2));
        alpha.set(position2, temp);

        System.out.println("After swap");
        System.out.println(alpha);

        System.out.println("---------------------------------------");
        //    19. Write a Java program to insert the specified element at the specified position in the linked list.
        System.out.println("Question number 19");

        String specifiedFruit = "BrotherHood";
        int specifiedIndex = 3;
        alpha.add(specifiedIndex, specifiedFruit);

        System.out.println(alpha);
        System.out.println("---------------------------------------");
        System.out.println("Question number 20");
        //20. Write a Java program to insert some elements at the specified position into a linked list.
        alpha.add(2, "Cherry");
        alpha.add(4, "marry");
        alpha.add(1, "harry");
        System.out.println(alpha);

        System.out.println("---------------------------------------");
        //  22. Write a Java program to display the elements and their positions in a linked list
        System.out.println("Question number 22");
        for (int i = 0; i < alpha.size(); i++) {
            System.out.println("Element : " + alpha.get(i) + " || " + " Index : " + i);
        }
        System.out.println("---------------------------------------");
        System.out.println("Question number 23");
        //23. Write a Java program to remove a specified element from a linked list.
        String removedElement = "marry";
        alpha.remove(removedElement);
        System.out.println(alpha);
        System.out.println("---------------------------------------");

        //  24. Write a Java program to shuffle the elements in a linked list.
        System.out.println("Question number 24");
        System.out.println("After shuffle.....");
        Collections.shuffle(alpha);
        System.out.println(alpha);
        System.out.println("---------------------------------------");

        //  25. Write a Java program to join two linked lists.

        System.out.println("Question number 25");
        LinkedList<String> alphabet = new LinkedList<>();
        alphabet.addLast("school");
        alphabet.addLast("meme");
        alphabet.addLast("ground");

        //adding two LinkedList
        alphabet.addAll(alpha);
        System.out.println(alphabet);

        System.out.println("---------------------------------------");
        System.out.println("Question number 26");

        //  26. Write a Java program to clone a linked list to another linked list.
        LinkedList<String> cloneList = (LinkedList<String>) alpha.clone();
        System.out.println("The clone list is : " + cloneList);

        //without using clone method
        LinkedList<String> clonedList = new LinkedList<>(alpha);
        System.out.println(clonedList);

        System.out.println("---------------------------------------");
        System.out.println("Question number 27");

        //  27. Write a Java program to remove and return the first element of a linked list.
        String removedFirst = alpha.removeFirst();
        System.out.println("The element removed is : " + removedFirst);
        System.out.println(alpha);

        System.out.println("---------------------------------------");
        System.out.println("Question number 28");

        // 28. Write a Java program to retrieve but does not remove, the first element of a linked list.

        String firstElement = alpha.peekFirst();
        System.out.println("The first element in fruits list is : " + firstElement);

        System.out.println("---------------------------------------");
        System.out.println("Question number 29");

        //29. Write a Java program to retrieve but does not remove, the last element of a linked list.
        String lastElement = alpha.peekLast();
        System.out.println("The last element in fruits list is : " + lastElement);

        System.out.println("---------------------------------------");
        System.out.println("Question number 30");

        //30. Write a Java program to check if a particular element exists in a linked list.
        String checkString = "bye";
        boolean check = alphabet.contains(checkString);
        if (check) {
            System.out.println("The element " + checkString + " is present in alpha list .");
        } else {
            System.out.println("The element " + checkString + " is not present in alpha list .");
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 31");

        // 31. Write a Java program to convert a linked list to array list.

        ArrayList<String> convert = new ArrayList<>(alpha);
        System.out.println("Converted LinkedList into a ArrayList is : " + convert);

        System.out.println("---------------------------------------");
        System.out.println("Question number 32");

        //32. Write a Java program to compare two linked lists.

        boolean compare = alpha.equals(alphabet);
        if (compare) {
            System.out.println("The alpha list and alphabet list are same .");
        } else {
            System.out.println("The alpha list and alphabet list are not same .");
        }
        System.out.println("---------------------------------------");
        System.out.println("Question number 33");

        // 33. Write a Java program to test a linked list is empty or not.

        boolean checkList = alpha.isEmpty();
        if (checkList) {
            System.out.println("The alpha list is empty .");
        } else {
            System.out.println("The alpha list is not  empty .");
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 34");

        //  34. Write a Java program to replace an element in a linked list.

        String replaceAlp = alpha.set(3, "potato");
        System.out.println("The replace alpha is : " + replaceAlp);
        System.out.println(alpha);

    }
}

