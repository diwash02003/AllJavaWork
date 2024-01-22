package com.CollectionFrameWork;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeDemo2 {

    public static void main(String[] args) {


        System.out.println("---------------------------------------");
        System.out.println("Question number 54");
        //54.  Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> number = new TreeSet<>();

        number.add(34);
        number.add(3);
        number.add(5);
        number.add(1);
        number.add(6);
        number.add(7);
        number.add(12);

        System.out.println(number.headSet(7));

        System.out.println("---------------------------------------");
        System.out.println("Question number 55");

        //55. Write a Java program to get the element in a tree set which is greater than or equal to the given element.

        System.out.println(number.ceiling(35));

        System.out.println("---------------------------------------");
        System.out.println("Question number 56");

        //56. Write a Java program to get the element in a tree set which is less than or equal to the given element.

        System.out.println(number.floor(2));

        System.out.println("---------------------------------------");
        System.out.println("Question number 57 and 58");

        //57. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.

        System.out.println(number.higher(8));

        //58. Write a Java program to get an element in a tree set which is strictly less than the given element.
        System.out.println(number.lower(2));

        System.out.println("---------------------------------------");
        System.out.println("Question number 59");

        //59. Write a Java program to retrieve and remove the first element of a tree set.

        //showing all number in tree
        System.out.println(number);
        //to retrieve and remove first element .
        System.out.println(number.pollFirst());
        //showing tree after deleting first number
        System.out.println(number);

        System.out.println("---------------------------------------");
        System.out.println("Question number 60");

        //60. Write a Java program to retrieve and remove the last element of a tree set.

        System.out.println(number);
        System.out.println(number.pollLast());
        System.out.println(number);

        System.out.println("---------------------------------------");
        System.out.println("Question number 61");

        //61. Write a Java program to remove a given element from a tree set.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to delete: ");
        int delete = scanner.nextInt();

        boolean remove = number.remove(delete);

        if (remove) {
            System.out.println("Number is deleted. ");
        } else {
            System.out.println("Number not found in tree ");
        }

        System.out.println(" After deleting number: " + number);

    }
}