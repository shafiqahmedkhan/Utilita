package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaviagtionBar {

    WebDriver driver;
    HelpPage helpPage;

    public NaviagtionBar(WebDriver driver) {
        this.driver = driver;
    }

    By HomeBtn = By.xpath("//div[@class='main-menu']/li[4]");

    public HelpPage clickHelpBtn(){
        driver.findElement(HomeBtn).click();
        helpPage = new HelpPage(driver);
        return helpPage;
    }
}
