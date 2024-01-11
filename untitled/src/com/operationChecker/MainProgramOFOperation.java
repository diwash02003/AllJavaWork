package com.operationChecker;

import java.util.Scanner;

public class MainProgramOFOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputIo inputIo = new InputIo();
        Input input = new Input();
        MathematicalOperation mathematicalOperation = new MathematicalOperation();
        inputIo.readAll(input);
        inputIo.display(input);

       // mathematicalOperation.findSquareNumberInRange(input.getLowerValue(),input.getUpperValue());
        boolean flag = true;
        while (flag){
            System.out.println("Menu: ");
            System.out.println("1.Check input value is prime or not\n2.Print all prime number\n3.Print all Even number\n4.Print all Palindrome number\n5.Exit");
            int choice= scanner.nextInt();

            switch(choice){
                case 1:
                    mathematicalOperation.checkValueAsPrime(input.getInputValue(),input);
                    break;
                case 2:
                    mathematicalOperation.findPrimeNumberInRange(input.getLowerValue(),input.getUpperValue());
                    break;
                case 3:
                    mathematicalOperation.findEvenNumberInRange(input.getLowerValue(),input.getUpperValue());
                    break;
                case 4:
                    mathematicalOperation.findPalindromeNumberInRange(input.getLowerValue(),input.getUpperValue());
                    break;
                case 5:
                    System.out.println("Exiting !!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter valid choice !!!");
            }
        }
    }
}
