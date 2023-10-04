package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    @Given("I have an AUT")
    public void iHaveAnAUT() {
        System.out.println("1");
        System.setProperty("webdriver.chrome.driver", "/Users/shafiqahmedkhan/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://utilita.co.uk/");
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
