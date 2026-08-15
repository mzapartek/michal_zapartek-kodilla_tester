package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] newCashMachines =
                new CashMachine[cashMachines.length + 1];

        System.arraycopy(
                cashMachines,
                0,
                newCashMachines,
                0,
                cashMachines.length
        );

        newCashMachines[newCashMachines.length - 1] = cashMachine;
        this.cashMachines = newCashMachines;
    }

    public int getTotalBalance() {
        int totalBalance = 0;

        for (CashMachine cashMachine : cashMachines) {
            totalBalance += cashMachine.getBalance();
        }

        return totalBalance;
    }

    public int getWithdrawalCount() {
        int count = 0;

        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    count++;
                }
            }
        }

        return count;
    }
    public int getDepositCount() {
        int count = 0;

        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    count++;
                }
            }
        }

        return count;
    }
    public double getAverageWithdrawal() {
        double sum = 0;
        int count = 0;

        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    sum += transaction;
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int count = 0;

        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    sum += transaction;
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }
}