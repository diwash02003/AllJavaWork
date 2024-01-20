package com.ListSetMap;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    /*
        A set represents a group or collection of items.
        Set has a special property that is unique items,
        it can not contain a duplicate item or element.
        It extends the collection interface.
        Note: Set interface does not have any additional method other than methods inherited from Collection interface.
        With all collection interface methods it adds the restriction that it can not contain a duplicate elements.
    */
    public static void main(String[] args) {
        //create set
        Set<String>  mySubjects = new HashSet<>();

        //Adding elements to set

        mySubjects.add("Theory of computation");
        mySubjects.add("C++");
        mySubjects.add("Java");
        mySubjects.add("Python programming");

        System.out.println(mySubjects);
        //print all subjects
        for(String subject : mySubjects){
            System.out.println(subject);
        }
    }
}
