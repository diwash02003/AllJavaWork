package com.CollectionFrameWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {

        System.out.println("Question number 62");
        //62. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");
        priorityQueue.add("Yellow");
        priorityQueue.add("Orange");

        //printing colors of priority queue
        System.out.println(priorityQueue);

        System.out.println("-------------------");
        System.out.println("Question number 63");

        //63.  Write a Java program to iterate through all elements in priority queue.
        for (String element : priorityQueue) {
            System.out.println(element);
        }

        System.out.println("-------------------");
        System.out.println("Question number 64");
        //64. Write a Java program to add all the elements of a priority queue to another priority queue.

        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();

        priorityQueue1.add("hariyo");
        priorityQueue1.add("Rato");

        //displaying original priority queue
        System.out.println("Original priority queue 1 :"+priorityQueue);
        System.out.println("Original priority queue 2 :"+priorityQueue1);

        //adding elements of priorityQueue into priorityQueue1
        priorityQueue1.addAll(priorityQueue);

        System.out.println("After adding elements from both priority queue"+priorityQueue1);


        System.out.println("-------------------");
        System.out.println("Question number 65");
        //65. Write a Java program to insert a given element into a priority queue.

        String GIvenElement = "pahelo";

        // Insert the element into the priority queue
        priorityQueue.offer(GIvenElement);

        // Display the priority queue after insertion
        System.out.println(priorityQueue);

        System.out.println("-------------------");
        System.out.println("Question number 66");
        //66. Write a Java program to remove all the elements from a priority queue.

        //original priorityQueue1
        System.out.println(priorityQueue1);

        priorityQueue1.clear();
        System.out.println(priorityQueue1);

        System.out.println("-------------------");
        System.out.println("Question number 67");

        //67. Write a Java program to count the number of elements in a priority queue.

        int prioritySize = priorityQueue.size();
        System.out.println("Size of priority queue is "+prioritySize);


        System.out.println("-------------------");
        System.out.println("Question number 68");

        //68. Write a Java program to compare two priority queues.
        System.out.println(priorityQueue);
        System.out.println(priorityQueue1);

        boolean isEqual = priorityQueue.equals(priorityQueue1);

        if(isEqual){
            System.out.println("Both Priority Queues are equal.");
        }
        else {
            System.out.println("Both Priority Queues are not equal.");

        }

        System.out.println("-------------------");
        System.out.println("Question number 69");
        //69. Write a Java program to retrieve the first element of the priority queue.

        System.out.println("First element of priority queue is "+priorityQueue.peek());
        System.out.println(priorityQueue);

        System.out.println("-------------------");
        System.out.println("Question number 70");
        //70. Write a Java program to retrieve and remove the first element of the priority queue.

        String  firstElement = priorityQueue1.poll();
        System.out.println("original priority queue: "+priorityQueue1);

        // display the retrieved and remove first element
        if(firstElement !=null){
            System.out.println("Retrieved and remove first element: "+firstElement);
        }
        else {
            System.out.println("The priority queue is empty.");
        }

        System.out.println("-------------------");
        System.out.println("Question number 71");

        //71. Write a Java program to convert a priority queue to an array containing all the elements of the queue.

        //convert the priority queue to an array
        String[] arrayFromPriority = priorityQueue.toArray(new String[0]);

        System.out.println(Arrays.toString(arrayFromPriority));

        System.out.println("-------------------");
        System.out.println("Question number 72");

        //72. Write a Java program to convert Priority Queue elements to a string representation.

        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(1);
        number.add(5);
        number.add(67);
        number.add(45);
        System.out.println(number);
        String numbers = number.toString();
        System.out.println(numbers);

        System.out.println("-------------------");
        System.out.println("Question number 73");
        //73. Write a Java program to change priorityQueue to maximum priority queue.

        System.out.println("Original :"+number);

        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        maxPriorityQueue.addAll(number);
        System.out.println("Max-Priority Queue: " + maxPriorityQueue);
    }
}
