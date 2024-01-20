package com.ListSetMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    /*
         A map in java, not extends the Collection interface.
         It represents a group of special elements or objects.
         Every map element or object contains key and value pair.
         A map can’t contain duplicate keys and one key can refer to at most one value.
     */
    public static void main(String[] args) {

        //create a map object
        Map<Integer, String> mySubject = new HashMap<Integer,String>();

        //Adding elements to hashmap

        mySubject.put(1,"c++");
        mySubject.put(2,"c++");
        mySubject.put(3," ");
        mySubject.put(4,"Theory of computation");
       // mySubject.entrySet();

        //print map elements
        for(Map.Entry subject: mySubject.entrySet()){
            System.out.println(subject.getKey()+ " - " +subject.getValue());
        }

    }
}

