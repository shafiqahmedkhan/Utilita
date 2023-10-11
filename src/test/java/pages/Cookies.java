package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cookies {

    WebDriver driver;
    By allowCookiesBtn = By.cssSelector("a[id*='AllowAll']");

    public Cookies(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAllowCookiesBtn(){
        driver.findElement(allowCookiesBtn).click();
    }

}
