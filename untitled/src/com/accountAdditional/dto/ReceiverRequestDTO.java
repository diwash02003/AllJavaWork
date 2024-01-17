package com.accountAdditional.dto;

public class ReceiverRequestDTO {
    private String ReceiverAccountNumber;
    private  float receivingBalance;
    public float getReceivingBalance() {
        return receivingBalance;
    }
    public void setReceivingBalance(float receivingBalance) {
        this.receivingBalance = receivingBalance;
    }
    public String getReceiverAccountNumber() {
        return ReceiverAccountNumber;
    }
    public void setReceiverAccountNumber(String receiverAccountNumber) {
        ReceiverAccountNumber = receiverAccountNumber;
    }
    public ReceiverRequestDTO(String receiverAccountNumber) {
        ReceiverAccountNumber = receiverAccountNumber;
    }
}
