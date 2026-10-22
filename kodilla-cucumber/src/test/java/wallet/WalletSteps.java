package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

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

    @Then("the balance of my wallet should be ${int}")
    public void the_balance_should_be(int amount) {
        assertEquals(amount, wallet.getBalance());
    }

    @Given("there is ${int} in my wallet")
    public void there_is_money_in_my_wallet(int amount) {
        wallet.deposit(amount);
    }

    @When("I withdraw ${int}")
    public void i_withdraw(int amount) {
        cashier.withdraw(wallet, amount);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_not_enough_money() {
        assertEquals("Not enough money", cashier.getMessage());

    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {

    }
    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(int amount) {
        assertEquals(amount, wallet.getBalance());
    }
    }