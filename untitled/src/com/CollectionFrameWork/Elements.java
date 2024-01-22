package com.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        System.out.println("Question number 7");

        /*
         7. to search an element in an array list.
         */
        ArrayList<String> colorrr = new ArrayList<>();

        //adding element in list
        colorrr.add("Red");
        colorrr.add("Blue");
        colorrr.add("Brown");
        colorrr.add("Violate");
        colorrr.add("Green");
        colorrr.add("Indigo");
        colorrr.add("Purple");
        colorrr.add("Black");
        colorrr.add("Marun");

        String targetString = "red";
        Search search = new Search();
        int result = search.searchElement(colorrr, targetString);

        if (result != -1) {
            System.out.println("Element  found at index " + result + ".");
        } else {
            System.out.println("Element  not found in the list.");
        }

        System.out.println("---------------------------------------");
        System.out.println("Question number 8");

        /*
        8. to sort a given array list.

         */
        // sort the arrayList
        Collections.sort(colorrr);
        //display the sorted arrayList
        System.out.println("Sorted ArrayList: " + colorrr);
        System.out.println("---------------------------------------");
        System.out.println("Question number 9");


        /*
         9. to extract a portion of an array list.
         */
        //extract portion
        int fromIndex = 1;
        int toIndex = 4;

        List<String> sublist = colorrr.subList(fromIndex, toIndex);
        //display the extracted portion
        System.out.println("Extracted Portion: " + sublist);
        System.out.println("---------------------------------------");
        System.out.println("Question number 10");


        /*
        10. to compare two array lists.
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Violate");
        arrayList.add("Green");
        arrayList.add("Indigo");
        arrayList.add("Purple");
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Brown");
        arrayList.add("Black");
        arrayList.add("Marun");

        boolean isEqual = colorrr.equals(arrayList);
        if (isEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
        System.out.println("---------------------------------------");
        System.out.println("Question number 11");

        /*
         11. to join two array lists.
         */
        colorrr.addAll(arrayList);
        System.out.println("Joined arraylist: "+colorrr);

        System.out.println("---------------------------------------");
        System.out.println("Question number 12");

        /*
        12. to empty an array list.
         */
        colorrr.clear();
        System.out.println("Array list after clearing: "+colorrr);
        System.out.println("---------------------------------------");
    }
}
