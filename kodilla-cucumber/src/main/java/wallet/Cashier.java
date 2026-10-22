package wallet;

public class Cashier {

    private final CashSlot cashSlot;
    private String message = "";

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else {
            message = "Not enough money";
        }
    }

    public String getMessage() {
        return message;
    }
}