package com.ArrayANdFunction;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        //declaration of array
        int [] marks;

        //initialization of array
        marks = new int [size];

        //how to add elements to that arrow
         //1. using for loop

        for(int i =0; i<size ;i++){
            System.out.println("Enter "+(i+1)+" marks");
            marks[i]=sc.nextInt();
        }

        //System.out.println(Arrays.toString(marks));

        //print ot excess element via loop

        for(int i =0; i<marks.length;i++){
            System.out.println("Element "+(i+1)+ " marks "+ marks[i]);
        }
    }

}
