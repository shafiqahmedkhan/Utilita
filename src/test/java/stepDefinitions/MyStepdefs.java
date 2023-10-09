package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseTest;
import pages.CustRefNoPage;
import pages.HelpPage;
import pages.HomePage;
import pages.NaviagtionBar;

public class MyStepdefs extends BaseTest {

    public NaviagtionBar naviagtionBar;
    public HomePage homePage;
    public HelpPage helpPage;

    public CustRefNoPage custRefNoPage;

    @Before
    public void tearUp() {
        homePage = startBrowser();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

    @Given("the home page is displayed")
    public void theHomePageIsDisplayed() {
        homePage.pageDisplayed();
    }

    @When("user clicks on Help")
    public void userClicksOnHelp() {
        helpPage = homePage.naviagtionBar.clickHelpBtn();
    }

    @Then("Help screen will load")
    public void helpScreenWillLoad() {
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

    @Then("error message {string} will show")
    public void errorMessageWillShow(String message) {
        custRefNoPage.errorMsgDisplayed(message);
    }

}
