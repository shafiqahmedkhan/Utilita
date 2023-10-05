package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By HomeBtn = By.xpath("//div[@class='main-menu']/li[4]");

    public void goTo(){
        driver.get("https://utilita.co.uk/");
    }

    public HelpPage clickHelpBtn(){
        driver.findElement(HomeBtn).click();
        HelpPage helpPage = new HelpPage(driver);
        return helpPage;
    }
}