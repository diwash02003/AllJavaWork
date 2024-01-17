package com.accountAdditional;

import com.accountAdditional.dto.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountIO {
   private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public   String readAccountHolderName() throws IOException {
        System.out.print("Enter account holder name: ");
        return bufferedReader.readLine();
    }
    public  String readAccountNumber() throws IOException {
        System.out.print("Enter account number: ");
        return bufferedReader.readLine();
    }
    public  float readAccountBalance() throws IOException {
        System.out.print("Enter Balance: ");
        return Float.parseFloat(bufferedReader.readLine());
    }
    public  float readAccountMinBalance() throws IOException {
        System.out.print("Enter min balance: ");
        return Float.parseFloat(bufferedReader.readLine());
    }
    public  String readAccountPin() throws IOException {
        String  pin = "";
        do{
            System.out.print("Enter pin: ");
            pin =  bufferedReader.readLine();
        }while (!(pin.length()>=4 && pin.length()<=6));
        return  pin;
    }

    public  Account readAccount() throws IOException {
        return new Account(readAccountHolderName(),readAccountNumber(),readAccountBalance(),readAccountMinBalance(),readAccountPin());
    }
    public AccountInformationRequestDTO readAccountInformationRequestDTO() throws IOException {
        System.out.println("You are here to read account information dto");
        AccountInformationRequestDTO accountInformationRequestDTO = new AccountInformationRequestDTO();
        accountInformationRequestDTO.setAccountNumber(readAccountNumber());
        accountInformationRequestDTO.setPin(readAccountPin());
        return accountInformationRequestDTO;
    }
    public DepositRequestDTO readDepositRequestDTO() throws IOException {
        return new DepositRequestDTO(readAccountNumber(),readAccountBalance(),readAccountPin());
    }
    public WithdrawRequestDTO readWithDrawRequestDTO() throws IOException {
        return new WithdrawRequestDTO(readAccountNumber(),readAccountBalance(),readAccountPin());
    }
   public SenderRequestDTO readSenderRequestDTO() throws IOException {
        return  new SenderRequestDTO(readAccountNumber(),readAccountBalance(),readAccountPin());
   }
   public ReceiverRequestDTO readReceiverRequestDTO() throws IOException {
        return new ReceiverRequestDTO(readAccountNumber());
   }
}
