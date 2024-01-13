package com.BankLoanInterestAndDepositInterestRate;

public class Bank {

    private String bankName;
    private float depositInterestRate;
    private float loanInterestRate;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public float getDepositInterestRate() {
        return depositInterestRate;
    }

    public void setDepositInterestRate(float depositInterestRate) {
        this.depositInterestRate = depositInterestRate;
    }

    public float getLoanInterestRate() {
        return loanInterestRate;
    }

    public void setLoanInterestRate(float loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }
}
