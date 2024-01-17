package com.accountAdditional.dto;

public class SenderRequestDTO {
    private String acNumber;
    private float SendingBalance;
    private String pin;

    public String getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    public SenderRequestDTO(String acNumber, float SendingBalance, String pin) {
        this.acNumber = acNumber;
        this.SendingBalance = SendingBalance;
        this.pin = pin;
    }

    public float getSendingBalance() {
        return SendingBalance;
    }

    public void setSendingBalance(float sendingBalance) {
        SendingBalance = sendingBalance;
    }
}
