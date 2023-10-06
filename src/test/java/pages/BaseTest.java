package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    public HomePage setUpBrowser() throws InterruptedException {
        String chromeDriverLocation = System.getProperty("user.dir")+"/src/test/java/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        Thread.sleep(3000);
        homePage.clickAllowCookiesBtn();
        //System.out.println(System.getProperty("user.dir")+"/src/test/java/resources/chromedriver");
        return homePage;
    }

    public void closeBrowser(){
        driver.close();
    }

}
