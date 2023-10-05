package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {

    WebDriver driver;

    public HelpPage(WebDriver driver){
        this.driver = driver;
    }
    By Title = By.cssSelector("h1[class='title']");

    public void goTo(){
        driver.get("https://utilita.co.uk/help");
    }

    public void titleDisplayed(){
        String elementText = driver.findElement(Title).getText();
        Assert.assertEquals(elementText, "Help Centre");
    }
}