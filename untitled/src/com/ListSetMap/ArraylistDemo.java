package com.ListSetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String choice = " ";
        List<Integer> myList = new ArrayList<>();
        do {
            System.out.print("Enter number to add in Array List:");
            myList.add(Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Do you want to add again ?(y / n) : ");
            choice = bufferedReader.readLine();
        } while (choice.equalsIgnoreCase("y"));

        for (Integer item : myList) {
            System.out.print(item +" ");
        }

    }

}
