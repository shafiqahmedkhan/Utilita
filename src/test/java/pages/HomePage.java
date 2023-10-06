package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    String homePageUrl = "https://utilita.co.uk/";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By HomeBtn = By.xpath("//div[@class='main-menu']/li[4]");
    By allowCookiesBtn = By.cssSelector("a[id*='AllowAll']");

    public void goTo(){
        driver.get(homePageUrl);
    }

    public void pageDisplayed(){
        Assert.assertEquals(homePageUrl, driver.getCurrentUrl());
    }

    public HelpPage clickHelpBtn(){
        driver.findElement(HomeBtn).click();
        HelpPage helpPage = new HelpPage(driver);
        return helpPage;
    }

    public void clickAllowCookiesBtn(){
        driver.findElement(allowCookiesBtn).click();
    }
}