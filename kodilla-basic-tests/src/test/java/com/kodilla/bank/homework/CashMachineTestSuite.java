package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroBalanceAndZeroTransactions() {
        CashMachine cashMachine = new CashMachine();

        assertEquals(0, cashMachine.getBalance());
        assertEquals(0, cashMachine.getTransactionsCount());
    }

    @Test
    public void shouldCalculateBalanceAndCountTransactions() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-40);

        assertEquals(60, cashMachine.getBalance());
        assertEquals(2, cashMachine.getTransactionsCount());
    }

    @Test
    public void shouldNotAddZeroTransaction() {
        CashMachine cashMachine = new CashMachine();

        cashMachine.addTransaction(0);

        assertEquals(0, cashMachine.getTransactionsCount());
        assertEquals(0, cashMachine.getBalance());
    }
}