package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpPage {

    WebDriver driver;

    public HelpPage(WebDriver driver){
        this.driver = driver;
    }
    By Title = By.cssSelector("h1[class='title']");
    By custRefLink = By.cssSelector("a[href*='/find-your-customer-reference-number']");

    public void goTo(){
        driver.get("https://utilita.co.uk/help");
    }

    public void titleDisplayed(){
        String elementText = driver.findElement(Title).getText();
        Assert.assertEquals(elementText, "Help Centre");
    }

    public CustRefNoPage navigateToCustRefNoPage(){
        driver.findElement(custRefLink).click();
        CustRefNoPage custRefNoPage = new CustRefNoPage(driver);
        return custRefNoPage;
    }
}