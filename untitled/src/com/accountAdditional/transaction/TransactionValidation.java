package com.accountAdditional.transaction;

import com.accountAdditional.Account;
import com.accountAdditional.dto.*;

public class TransactionValidation {
    public boolean validateWithDrawRequest(Account[] accounts, WithdrawRequestDTO dto) {
        Account account = pullMatchingAccount(accounts, dto.getAcNumber());
        if (account != null) {
            if (dto.getWithDrawBalance() < 0 || account.getMinBalance() >= (account.getAccountBalance() - dto.getWithDrawBalance())) {
                System.out.println("Insufficient balance !!!");
                return false;
            }
            if (!account.getPin().equals(dto.getPin())) {
                System.out.println("Invalid pin!!!");
            }
        }
        return true;
    }

    public boolean validateDepositRequest(Account[] accounts, DepositRequestDTO dto) {
        if (dto.depositBalance() <= 0) {
            System.out.println("Invalid deposit amount");
            return false;
        }
        Account account = pullMatchingAccount(accounts, dto.getAcNumber());
        if (account != null) {
            if (!account.getPin().equals(dto.getPin())) {
                System.out.println("Invalid pin!!!");
            }

        } else {
            System.out.println("Invalid account number !!!");
            return false;
        }
        return true;
    }

    public Account pullMatchingAccount(Account[] accounts, String accountNumber) {
        for (Account account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        return null;
    }

    public boolean validateSenderRequest(Account[] accounts, SenderRequestDTO senderRequestDTO) {
        Account account = pullMatchingAccount(accounts, senderRequestDTO.getAcNumber());
        if (account != null) {
            if (senderRequestDTO.getSendingBalance() < 0 || account.getMinBalance() >= (account.getAccountBalance() - senderRequestDTO.getSendingBalance())) {
                System.out.println("Fund transfer cannot perform !!!");
                return false;
            }
            if (!account.getPin().equals(senderRequestDTO.getPin())) {
                System.out.println("Invalid pin!!!");
            }
        }
        return true;
    }

    public boolean validateReceiverRequest(Account[] accounts, ReceiverRequestDTO receiverRequestDTO) {
        Account account = pullMatchingAccount(accounts, receiverRequestDTO.getReceiverAccountNumber());
        if (account != null){
           // System.out.println("Account not found !!!");
            return true;
        }
        return false;
    }
}
