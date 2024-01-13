package com.BankLoanInterestAndDepositInterestRate;

import com.operationChecker.Input;

import java.util.Scanner;

public class BankIO {
    void readBank(Bank bank){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bank Name:");
        bank.setBankName(scanner.nextLine());
        System.out.print("Enter Bank Deposit Interest Rate:");
        bank.setDepositInterestRate(scanner.nextFloat());
        System.out.print("Enter Bank Loan Interest Rate:");
        bank.setLoanInterestRate(scanner.nextFloat());
    }
    void DisplayBank(Bank bank){
        System.out.println("Name: "+bank.getBankName()+" | "+" Deposit IR : "+bank.getDepositInterestRate()+" |"+" Loan IR: "+bank.getLoanInterestRate());
    }
}
