package com.CollectionFrameWork;

import java.util.LinkedList;

public class LinkListQuestions {
    public static void main(String[] args) {
        System.out.println("Question number 15");

        /*
        15. Write a Java program to append the specified element to the end of a linked list.
         */
        LinkedList<String > linkedList = new LinkedList<>();


        linkedList.add("My ");
        linkedList.add("Name");
        linkedList.add(2,"is");
        linkedList.add("Diwash");
        System.out.println(linkedList);

        //to append the specified element to the end
        linkedList.addLast("Pokhrel");

        System.out.println(linkedList);

        System.out.println("---------------------------------------");
        System.out.println("Question number 16");


        /*
        16. Write a Java program to iterate through all elements in a linked list.
         */
        for(String  info : linkedList){
            System.out.print(info+ " ");
        }
        System.out.println();
        for(int i = 0; i<linkedList.size();i++){
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Question number 17");


        /*
        Write a Java program to get the first and last occurrence of the specified elements in a linked list.
         */
        // use indexOf and lastIndexOf.....

        String  specifiedElement ="Diwash";
        // first occurrence
        int firstOccur = linkedList.indexOf(specifiedElement);
        System.out.println("The element "+ specifiedElement+ " first occurred at index "+ firstOccur +" . ");
        //last occurrence
        int lastOccur = linkedList.lastIndexOf(specifiedElement);
        System.out.println("The element "+ specifiedElement+ " last occurred at index "+ lastOccur +" . ");
    }
}
