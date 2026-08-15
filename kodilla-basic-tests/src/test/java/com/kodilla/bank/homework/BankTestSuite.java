package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroValuesWhenBankIsEmpty() {
        Bank bank = new Bank();

        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getWithdrawalCount());
        assertEquals(0, bank.getDepositCount());
        assertEquals(0.0, bank.getAverageWithdrawal(), 0.001);
        assertEquals(0.0, bank.getAverageDeposit(), 0.001);
    }

    @Test
    public void shouldCalculateValuesForTwoCashMachines() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-40);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(-60);

        Bank bank = new Bank();
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(200, bank.getTotalBalance());
        assertEquals(2, bank.getWithdrawalCount());
        assertEquals(2, bank.getDepositCount());
        assertEquals(-50.0, bank.getAverageWithdrawal(), 0.001);
        assertEquals(150.0, bank.getAverageDeposit(), 0.001);
    }

    @Test
    public void shouldReturnZeroAverageWhenThereAreNoWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(200);

        Bank bank = new Bank();
        bank.addCashMachine(cashMachine);

        assertEquals(0, bank.getWithdrawalCount());
        assertEquals(0.0, bank.getAverageWithdrawal(), 0.001);
        assertEquals(2, bank.getDepositCount());
        assertEquals(150.0, bank.getAverageDeposit(), 0.001);
    }
}