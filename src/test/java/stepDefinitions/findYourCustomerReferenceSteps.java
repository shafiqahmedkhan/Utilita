package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.BaseTest;
import pages.CustRefNoPage;
import pages.HelpPage;
import pages.HomePage;
import pages.NaviagtionBar;

public class findYourCustomerReferenceSteps extends BaseTest {

    public NaviagtionBar naviagtionBar;
    public HomePage homePage;
    public HelpPage helpPage;

    public CustRefNoPage custRefNoPage;

    @Given("the home page is displayed")
    public void theHomePageIsDisplayed() {
        homePage.pageDisplayed();
    }

    @When("user navigates to the help page")
    public void userNavigatesToTheHelpPage() {
        helpPage = homePage.naviagtionBar.clickHelpBtn();
    }

    @Then("help screen is displayed")
    public void helpScreenIsDisplayed() {
        helpPage.titleDisplayed();
    }

    @Given("user navigates to the your customer reference number page")
    public void userNavigatesToTheYourCustomerReferenceNumberPage() {
        helpPage = homePage.naviagtionBar.clickHelpBtn();
        custRefNoPage = helpPage.navigateToCustRefNoPage();
    }

    @When("no details are filled out")
    public void noDetailsAreFilledOut() {
        custRefNoPage.findCustRefNo();
    }

    @Then("error message {string} is shown")
    public void errorMessageIsShown(String message) {
        custRefNoPage.errorMsgDisplayed(message);
    }

}
