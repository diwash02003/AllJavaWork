package com.BankLoanInterestAndDepositInterestRate;

import java.util.Scanner;

public class MainDepositAndLoanInterest {
    public static void main(String[] args) {

        Bank[] bank  = new Bank[3];
        BankIO bankIO = new BankIO();
        BankTransition bankTransition = new BankTransition();

        Scanner scanner = new Scanner(System.in);
        boolean flag =true;
        while(flag){
            System.out.println("1.Admin | 2.User | 3.Exit ");
            System.out.print("Enter Option:");
            int choice = scanner.nextInt();
            System.out.println("-----------------------------------");

            switch(choice){
                case 1:
                    System.out.println("Admin Interface: ");
                    System.out.println("-----------------");

                    for(int i = 0;i<bank.length;i++){
                        bank[i] = new Bank();
                        bankIO.readBank(bank[i]);
                        System.out.println("-----------------------------------");

                    }
                    System.out.println("-----------------------------------");

                    break;
                case 2:
                    System.out.println("User Interface: ");
                    System.out.println("-----------------");

                    for (int i = 0;i<bank.length;i++){
                        bankIO.DisplayBank(bank[i]);
                    }
                    System.out.println("-----------------------------------");


                    boolean flag1 =true;
                    while(flag1){
                        System.out.println("1.Deposit Money | 2.Take Loan | 3.Exit");
                        System.out.print("Enter Option:");
                        int option = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("-----------------------------------");

                        switch (option){
                            case 1:
                                System.out.print("Enter bank name to deposit money:");
                                String name = scanner.nextLine().toLowerCase();
                                for(int i = 0;i<bank.length;i++){
                                   if( bank[i].getBankName().toLowerCase().contains(name)){
                                       System.out.print("Enter amount and time for deposit: ");
                                       double amount = scanner.nextDouble();
                                       float time = scanner.nextFloat();
                                       bankTransition.deposit(bank[i],amount,time);
                                       System.out.println("-----------------------------------");
                                   }
                                }
                                break;
                            case 2:
                                System.out.print("Enter bank name to take loan: ");
                                String nAme = scanner.nextLine().toLowerCase();
                                for(int i = 0;i<bank.length;i++){
                                    if( bank[i].getBankName().toLowerCase().contains(nAme)){
                                        System.out.print("Enter amount and time for taking loan: ");
                                        double amount = scanner.nextDouble();
                                        float time = scanner.nextFloat();
                                        bankTransition.loan(bank[i],amount,time);
                                        System.out.println("-----------------------------------");
                                    }
                                }
                                break;
                            case 3:
                                flag1 =false;
                                break;
                            default:
                                System.out.println("Please Enter valid choice !!!");
                                System.out.println("-----------------------------------");
                                break;
                        }
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Please Enter valid choice !!!");
                    System.out.println("-----------------------------------");
                    break;
            }
        }
    }
}
