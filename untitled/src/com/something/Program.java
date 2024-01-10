package com.something;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float firstNum = sc.nextFloat();

        System.out.println("Enter second number: ");
        float secondNum =sc.nextFloat();

        float sum =firstNum + secondNum;
        float subtract =firstNum + secondNum;
       // float sum =firstNum + secondNum;
//float sum =firstNum + secondNum;

        System.out.println("Addition of number is : "+sum );

    }
}
