 package com.fraud.oop;

public class Transaction {

    private int transactionId;
    private int userId;
    private double amount;
    private String timestamp;

    public Transaction(int transactionId, int userId, double amount, String timestamp) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
