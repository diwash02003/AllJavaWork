package com.CollectionFrameWork;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {


        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");
        priorityQueue.add("Yellow");
        priorityQueue.add("Orange");
        System.out.println(priorityQueue);

        for(String  color : priorityQueue){
            System.out.println(color);
        }

        System.out.println("-------------------");

        Iterator<String > iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            String  element = iterator.next();
            System.out.println(element);
        }


    }
}
