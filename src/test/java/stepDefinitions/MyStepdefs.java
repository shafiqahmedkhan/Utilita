package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.BaseTest;
import pages.CustRefNoPage;
import pages.HelpPage;
import pages.HomePage;

public class MyStepdefs extends BaseTest {

    WebDriver driver;
    public HomePage homePage;
    public HelpPage helpPage;

    public CustRefNoPage custRefNoPage;

    @Before
    public void tearUp() throws InterruptedException {
        homePage = startBrowser();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

    @Given("the home page is displayed")
    public void theHomePageIsDisplayed() throws InterruptedException {
        homePage.pageDisplayed();
    }

    @When("user clicks on Help")
    public void userClicksOnHelp() {
        helpPage = homePage.clickHelpBtn();
    }

    @Then("Help screen will load")
    public void helpScreenWillLoad() {
        helpPage.titleDisplayed();
    }

    @Given("user navigates to the your customer reference number page")
    public void userNavigatesToTheYourCustomerReferenceNumberPage() throws InterruptedException {
        homePage = startBrowser();
        helpPage = homePage.clickHelpBtn();
        custRefNoPage = helpPage.navigateToCustRefNoPage();
    }

    @When("no details are filled out")
    public void noDetailsAreFilledOut() {
        custRefNoPage.findCustRefNo();
    }

    @And("user clicks on Find button")
    public void userClicksOnFindButton() {
        System.out.println("2");
    }

    @Then("error message {string} will show")
    public void errorMessageWillShow(String message) {
        custRefNoPage.errorMsgDisplayed(message);
    }

}
