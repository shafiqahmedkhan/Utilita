package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I have an AUT")
    public void iHaveAnAUT() {
        System.out.println("1");
    }

    @When("I test this AUT")
    public void iTestThisAUT() {
        System.out.println("2");
    }

    @Then("its should pass")
    public void itsShouldPass() {
        System.out.println("3");
    }
}
