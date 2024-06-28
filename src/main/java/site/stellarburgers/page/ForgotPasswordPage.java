package site.stellarburgers.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    WebDriver driver;
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    private final By signInLinkLocator = By.xpath("//a[text()='Войти']");
    public void clickSignInLink(){
        WebElement signInLink = driver.findElement(signInLinkLocator);
        signInLink.click();
    }
}
