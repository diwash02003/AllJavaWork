package com.accountAdditional.transaction;

import com.accountAdditional.Account;
import com.accountAdditional.dto.*;

public class Transaction extends TransactionValidation {
    public void displayAccountInformation(Account[] accounts, AccountInformationRequestDTO accountInformationRequestDTO) {
        for (Account account : accounts) {
            if (account.getPin().equals(accountInformationRequestDTO.getPin()) && account.getAccountNumber().equals(accountInformationRequestDTO.getAccountNumber())) {
                System.out.println(account);
            }
        }
    }

    public void deposit(Account[] accounts, DepositRequestDTO depositRequestDTO) {
        System.out.println("Deposit initiated !!!");
        boolean isValid = validateDepositRequest(accounts, depositRequestDTO);
        if (isValid) {
            Account account = pullMatchingAccount(accounts, depositRequestDTO.getAcNumber());
            account.setAccountBalance(account.getAccountBalance() + depositRequestDTO.depositBalance());
            System.out.println("Success Deposit !!!");
        } else {
            System.out.println(":Deposit cannot be completed !!!");
        }
    }

    public void withDraw(Account[] accounts, WithdrawRequestDTO withdrawRequestDTO) {
        System.out.println("WithDraw initiated !!!");
        boolean isValid = validateWithDrawRequest(accounts, withdrawRequestDTO);
        if (isValid) {
            Account account = pullMatchingAccount(accounts, withdrawRequestDTO.getAcNumber());
            account.setAccountBalance(account.getAccountBalance() - withdrawRequestDTO.getWithDrawBalance());
            System.out.println("Success withdraw !!!");

        } else {
            System.out.println("Withdraw cannot completed !!!");
        }
    }
    public void fundTransfer(Account[] accounts, SenderRequestDTO senderRequestDTO, ReceiverRequestDTO receiverRequestDTO) {
        System.out.println("Fund transfer initiated !!!");
        boolean isValid = validateSenderRequest(accounts, senderRequestDTO) && validateReceiverRequest(accounts, receiverRequestDTO);
        if (isValid) {
            Account account = pullMatchingAccount(accounts, senderRequestDTO.getAcNumber());
            account.setAccountBalance(account.getAccountBalance() - senderRequestDTO.getSendingBalance());
        } else {
            System.out.println("Fund transfer cannot complete !!!");
        }
        if (isValid) {

            Account account = pullMatchingAccount(accounts, receiverRequestDTO.getReceiverAccountNumber());
            account.setAccountBalance(account.getAccountBalance() + senderRequestDTO.getSendingBalance());
        }
        else {
            System.out.println("Fund transfer cannot complete !!!");
        }
    }
}