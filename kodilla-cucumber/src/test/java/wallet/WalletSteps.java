package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance());
    }

    @When("I request ${int}")
    public void i_request(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, amount);
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int amount) {
        assertEquals(amount, cashSlot.getContents());
    }
}