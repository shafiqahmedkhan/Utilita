package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    public WebDriver initializeDriver() {
        String chromeDriverLocation = System.getProperty("user.dir")+"/src/test/java/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public HomePage startBrowser() throws InterruptedException {
        HomePage homePage = new HomePage(initializeDriver());
        homePage.goTo();
        Thread.sleep(3000);
        homePage.clickAllowCookiesBtn();
        return homePage;
    }

    public void closeBrowser(){
        driver.close();
    }

}
