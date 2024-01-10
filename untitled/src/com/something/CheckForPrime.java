package com.something;

import java.util.Scanner;

public class CheckForPrime {

    //prime number is a number that is divisible by 1 and itself.

    public static void main(String[] args) {

        int count=0;
        int num =18;

        //Scanner sc =new Scanner(System.in);

//        System.out.println("Enter the range of number from where you want to find the list of prime number: ");
//        System.out.println("Minimum range: ");
//        int  num1 =sc.nextInt();
//        System.out.println("Maximum range: ");
//        int num2 = sc.nextInt();

        for(int i =1;i<=num;i++){
            if(num % i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }

        //sc.close();
    }

}
