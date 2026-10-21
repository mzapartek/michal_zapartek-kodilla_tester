package seasonchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {

    private int number;
    private String result;

    @Given("number is {int}")
    public void number_is(int number) {
        this.number = number;
    }

    @When("I check the number")
    public void i_check_the_number() {
        this.result = FizzBuzz.check(this.number);
    }

    @Then("I should get {string}")
    public void i_should_get(String expected) {
        assertEquals(expected, this.result);
    }
}