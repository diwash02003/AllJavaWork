package com.ListSetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListWorks {
   private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public List<Integer> readArrayList() throws IOException {
        List<Integer>  myList = new ArrayList<>();
        String choice = "";
        do{
            System.out.print("Enter element:");
            myList.add(Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Do you want to add element again ? (y / n)");
            choice = bufferedReader.readLine();
        }while(choice.equalsIgnoreCase("y"));
        return  myList;
    }
}
