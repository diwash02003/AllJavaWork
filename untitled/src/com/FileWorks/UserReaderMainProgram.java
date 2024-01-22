package com.FileWorks;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class UserReaderMainProgram {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        UserReaderIO userReaderIO = new UserReaderIO();

        List<User> userList = userReaderIO.getUserList("user.txt");

        for (User user : userList) {
            System.out.println("RollNumber: " + user.getRollNumber() + "    Name: " + user.getFirstName() +" " +user.getLastName() + "    Phone Number: " + user.getMobileNumber());
        }


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Printing name start with  'a' ");
        for (User user : userList) {
            char name = user.getFirstName().toLowerCase().charAt(0);
            if (name == 'a') {
                System.out.println("RollNumber: " + user.getRollNumber() + "    Name: " + user.getFirstName() +" " +user.getLastName() + "    Phone Number: " + user.getMobileNumber());
            }
        }


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Printing name start with  'b' ");
        for (User user : userList) {
            char name = user.getFirstName().toLowerCase().charAt(0);
            if (name == 'b') {
                System.out.println("RollNumber: " + user.getRollNumber() + "    Name: " + user.getFirstName() +" " +user.getLastName() + "    Phone Number: " + user.getMobileNumber());
            }
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Printing phone number start with  '77' ");
        for (User user : userList) {
            String name = user.getMobileNumber().substring(0, 2);
            if (name.equals("77")) {
                System.out.println("RollNumber: " + user.getRollNumber() + "    Name: " + user.getFirstName() +" " +user.getLastName() + "    Phone Number: " + user.getMobileNumber());
            }
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.print("Enter name to check:");
        String name = scanner.nextLine();
        for (User user : userList) {
            boolean isTrue = user.getFirstName().equalsIgnoreCase(name);
            //System.out.println(isTrue);
            if (isTrue) {
                System.out.println("RollNumber: " + user.getRollNumber() + "    Name: " + user.getFirstName() +" " +user.getLastName() + "    Phone Number: " + user.getMobileNumber());
            }
        }
    }
}




