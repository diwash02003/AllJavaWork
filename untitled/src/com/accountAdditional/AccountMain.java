package com.accountAdditional;

import com.accountAdditional.dto.*;
import com.accountAdditional.transaction.Transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AccountMain {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);
        AccountIO accountIO = new AccountIO();
        Transaction transaction = new Transaction();

        int size = 3 ;
        Account[] accounts = new Account[size];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = accountIO.readAccount();
        }
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println("----------------------------------- ");

        boolean flag = true;
        while (flag) {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Fund transfer");
            System.out.println("4.Account information");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            switch (Integer.parseInt(bufferedReader.readLine())) {
                case 1:
                    DepositRequestDTO depositRequestDTO = accountIO.readDepositRequestDTO();
                    transaction.deposit(accounts, depositRequestDTO);

                    break;
                case 2:
                    WithdrawRequestDTO withdrawRequestDTO = accountIO.readWithDrawRequestDTO();
                    transaction.withDraw(accounts, withdrawRequestDTO);
                    break;
                case 3:
                    SenderRequestDTO senderRequestDTO = accountIO.readSenderRequestDTO();
                    ReceiverRequestDTO receiverRequestDTO = accountIO.readReceiverRequestDTO();
                    transaction.fundTransfer(accounts, senderRequestDTO, receiverRequestDTO);
                    System.out.println("----------------------------------- ");
                    for (Account account : accounts) {
                        System.out.println(account);
                        System.out.println("----------------------------------- ");
                    }
                    break;
                case 4:
                    AccountInformationRequestDTO accountInformationRequestDTO = accountIO.readAccountInformationRequestDTO();
                    transaction.displayAccountInformation(accounts, accountInformationRequestDTO);
                    break;
                case 5:
                    flag = false;
                    System.out.println("Thank you !!!");
                    break;
                default:
                    System.out.println("Enter valid option !!!");
            }

        }

    }
}