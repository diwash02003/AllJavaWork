package com.something;

import java.util.Scanner;

public class CheckForDivisible {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number =sc.nextInt();

        if(number % 5 ==0){
            System.out.println("The number is divisible by 5.");
        }
        else{
            System.out.println("The number is not divisible by 5.");
        }
    }
}
