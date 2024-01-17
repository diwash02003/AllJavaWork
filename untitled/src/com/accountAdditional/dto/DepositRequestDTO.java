package com.accountAdditional.dto;

public class DepositRequestDTO {

    //account number ,balance ,pin
    private String acNumber;
    private float TransferBalance;
    private String pin;

    public String getAcNumber() {
        return acNumber;
    }

    public float depositBalance() {
        return TransferBalance;
    }

    public String getPin() {
        return pin;
    }

    public DepositRequestDTO(String acNumber, float TransferBalance, String pin) {
        this.acNumber = acNumber;
        this.TransferBalance = TransferBalance;
        this.pin = pin;
    }
}
