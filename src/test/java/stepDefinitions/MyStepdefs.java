package stepDefinitions;


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
}
