package com.something;

import java.util.Scanner;

public class AccountMainProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter Your Balance:");
        float balance = sc.nextFloat();
        sc.nextLine();

        System.out.println("Enter Account Name:");
        String accountName = sc.nextLine();

        //using constructor --------------------

        //Account ac = new Account(String accountNumber, float balance, String accountName);

        // System.out.println("Your account number is: "+accountNumber);
        // System.out.println("Your account balance is: "+balance);
        // System.out.println("Your account name is: "+accountName);



    }
}









