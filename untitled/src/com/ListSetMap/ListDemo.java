package com.ListSetMap;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    /*
         A List in java extends the collection interface and
         represent An sequenced or ordered group of elements.
         It can contain duplicate elements.
         It also defines some additional methods which it inherits from Collection interface.
         Note: Elements in List can be inserted, updated, or retrieved by their position or index.
         Index or position value starts from 0
     */
    public static void main(String[] args) {
        //create list object
        List<String> mySubjects = new ArrayList<>();

        //Add element to list
        mySubjects.add("Java");
        mySubjects.add("C++");
        mySubjects.add("Java");
        mySubjects.add("Theory of computation");

        //System.out.println(mySubjects);

        //Add elements at specified location
        mySubjects.add(1, "DBMS");
        mySubjects.add(2, "Artificial Intelligence");

        //System.out.println(mySubjects);

        //print all subjects
        for (String subject : mySubjects) {
            System.out.println(subject);
        }
        //print subject by index
        System.out.println("Subject at index 2 is " + mySubjects.get(2));
    }


}
