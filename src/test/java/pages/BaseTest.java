package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    public HomePage setUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/shafiqahmedkhan/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        return homePage;
    }

    public void closeBrowser(){
        driver.close();
    }

}
