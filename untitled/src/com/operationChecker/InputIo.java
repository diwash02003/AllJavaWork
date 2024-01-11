package com.operationChecker;

import java.util.Scanner;

public class InputIo {
    static Scanner scanner = new Scanner(System.in);

    void readValue(Input input){
        System.out.print("Enter a value: ");
        input.setInputValue(scanner.nextInt());
    }
    void   readUpperValue(Input input){
        System.out.print("Enter Upper Value: ");
       input.setUpperValue( scanner.nextInt());
    }
        void  readLowerValue(Input input){
        System.out.print("Enter Lower Value: ");
        input.setLowerValue(scanner.nextInt());
    }
    public void  readAll(Input input){
        readValue(input);
        readLowerValue(input);
        readUpperValue(input);

    }
    void display(Input input){
        System.out.println("Input value: "+input.getInputValue());
        System.out.println("Lower Value: "+input.getLowerValue());
        System.out.println("Upper value: "+ input.getUpperValue());

    }
}
