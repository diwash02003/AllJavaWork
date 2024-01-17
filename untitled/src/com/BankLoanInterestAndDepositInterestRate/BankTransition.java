package com.BankLoanInterestAndDepositInterestRate;

public class BankTransition {

    void deposit (Bank bank ,double amount, float time){

        double CompoundAmount = amount * (Math.pow((1+bank.getDepositInterestRate()/100),time));
        System.out.println("Your amount after "+ +time +" years will be: "+String.format("%.2f",CompoundAmount));
    }
    void loan(Bank bank,double amount, float time){
        double payingAmount = amount+(amount * time * bank.getLoanInterestRate()/100);
        System.out.println("You should pay "+String.format("%.2f",payingAmount)+ " after "+ time+ " years." );
    }
}