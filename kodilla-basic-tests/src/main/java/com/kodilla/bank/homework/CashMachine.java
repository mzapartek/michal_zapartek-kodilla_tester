package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int value) {
        if (value == 0) {
            return;
        }

        this.size++;
        int[] newTransactions = new int[this.size];

        System.arraycopy(
                transactions,
                0,
                newTransactions,
                0,
                transactions.length
        );

        newTransactions[this.size - 1] = value;
        this.transactions = newTransactions;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        int balance = 0;

        for (int transaction : transactions) {
            balance += transaction;
        }

        return balance;
    }

    public int getTransactionsCount() {
        return transactions.length;
    }
}


