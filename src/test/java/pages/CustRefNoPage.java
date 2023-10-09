package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.environment;

public class CustRefNoPage {

    WebDriver driver;

    String custRefNoPageUrl = environment.CUSTREFNOPAGE.getUrl();

    public CustRefNoPage(WebDriver driver){
        this.driver = driver;
    }

    By findBtn = By.cssSelector("a[class*='find-crn-btn']");
    By errorMsg = By.cssSelector("div[class*='crn-response-message']");

    public void goTo(){
        driver.get(custRefNoPageUrl);
    }

    public void findCustRefNo(){
        driver.findElement(findBtn).click();
    }

    public void errorMsgDisplayed(String message){
        String errorMsgTxt = driver.findElement(errorMsg).getText();
        Assert.assertEquals(message, errorMsgTxt);
    }

}