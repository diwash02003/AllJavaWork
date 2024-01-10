package com.something;

import java.util.Scanner;

public class CheckNum {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number =sc.nextInt();

        if(number%2 ==0 ){
            System.out.println("The input number is even.");
        }
        else{
            System.out.println("The input number is odd.");
        }
    }

}

