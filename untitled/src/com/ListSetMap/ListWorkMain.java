package com.ListSetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListWorkMain {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ListWorks listWorks = new ListWorks();
        List<Integer> arraylist = new ArrayList<>();
        ListFunction listFunction = new ListFunction();

        System.out.println("----------------------------------- ");
        boolean flag = true;
        while (flag) {

            System.out.println("1.For adding value ");
            System.out.println("2. Find sum");
            System.out.println("3. Find smallest");
            System.out.println("4.Find largest");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            switch (Integer.parseInt(bufferedReader.readLine())) {
                case 1:
                    arraylist = listWorks.readArrayList();
                    break;
                case 2:
                    System.out.println("Sum: " + listFunction.sumOfArraylist(arraylist));
                    break;
                case 3:
                    System.out.println("Smallest: " + listFunction.smallestOfArray(arraylist));
                    break;
                case 4:
                    System.out.println("Largest: " + listFunction.largestOfArray(arraylist));
                    break;
                case 5:
                    flag = false;
                    System.out.println("Thank you !!!");
                    break;
                default:
                    System.out.println("Enter valid option !!!");
            }
        }
    }
}

