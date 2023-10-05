package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BaseTest;
import pages.HelpPage;
import pages.HomePage;

public class MyStepdefs extends BaseTest {

    WebDriver driver;
    public HomePage homePage;
    public HelpPage helpPage;

    @After
    public void tearDown(){
        closeBrowser();
    }

    @Given("the website has loaded")
    public void theWebsiteHasLoaded() {
        //System.setProperty("webdriver.chrome.driver", "/Users/shafiqahmedkhan/Downloads/chromedriver-mac-arm64/chromedriver");
        //driver = new ChromeDriver();
        homePage = setUpBrowser();
        //HomePage homePage = new HomePage(driver);
        //homePage.goTo();
    }

    @When("user clicks on Help")
    public void userClicksOnHelp() {
        //HomePage homePage = new HomePage(driver);
        helpPage = homePage.clickHelpBtn();
    }

    @Then("Help screen will load")
    public void helpScreenWillLoad() {
        helpPage.titleDisplayed();
        //System.out.println("123");
//        Thread.sleep(5000);
        //HelpPage helpPage = new HelpPage(driver);
        //helpPage.titleDisplayed();
        //driver.findElement(By.linkText("Help Centre"));

    }

    @Given("user navigates to the your customer reference number page")
    public void userNavigatesToTheYourCustomerReferenceNumberPage() {
        homePage = setUpBrowser();
    }

    @When("no details are filled out")
    public void noDetailsAreFilledOut() {
        System.out.println("1");
    }

    @And("user clicks on Find button")
    public void userClicksOnFindButton() {
        System.out.println("2");
    }

    @Then("error message ‘Please provide your email\\/phone number and postcode’ will show")
    public void errorMessagePleaseProvideYourEmailPhoneNumberAndPostcodeWillShow() {
        System.out.println("3");
    }
}
