package resources;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTest {

    WebDriver driver;
    public HomePage homePage;

    public WebDriver initializeDriver() {
        String chromeDriverLocation = System.getProperty("user.dir")+"/src/test/java/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public HomePage startBrowser() {
        HomePage homePage = new HomePage(initializeDriver());
        homePage.goTo();
        homePage.cookies.clickAllowCookiesBtn();
        return homePage;
    }

    public void closeBrowser(){
        driver.close();
    }

    @Before
    public void tearUp() {
        homePage = startBrowser();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
