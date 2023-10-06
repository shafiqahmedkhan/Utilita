package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    public HomePage setUpBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/shafiqahmedkhan/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        Thread.sleep(3000);
        homePage.clickAllowCookiesBtn();
        return homePage;
    }

    public void closeBrowser(){
        driver.close();
    }

}
