package com.accountAdditional.dto;

public class WithdrawRequestDTO {
    //account number ,balance ,pin

    private String acNumber;
    private float withDrawBalance;
    private String pin;

    public String getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }

    public float getWithDrawBalance() {
        return withDrawBalance;
    }

    public void setWithDrawBalance(float withDrawBalance) {
        this.withDrawBalance = withDrawBalance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public WithdrawRequestDTO(String acNumber, float withDrawBalance, String pin) {
        this.acNumber = acNumber;
        this.withDrawBalance = withDrawBalance;
        this.pin = pin;
    }
    public WithdrawRequestDTO(){

    }

}
