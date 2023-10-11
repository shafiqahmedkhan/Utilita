package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.environment;

public class HomePage {

    WebDriver driver;
    public NaviagtionBar naviagtionBar;
    public Cookies cookies;
    String homePageUrl = environment.HOMEPAGE.getUrl();

    public HomePage(WebDriver driver){
        this.driver = driver;
        naviagtionBar = new NaviagtionBar(driver);
        cookies = new Cookies(driver);
    }

    public void goTo(){
        driver.get(homePageUrl);
    }

    public void pageDisplayed(){
        Assert.assertEquals(homePageUrl, driver.getCurrentUrl());
    }

}