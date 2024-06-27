package site.stellarburgers.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    WebDriver driver;
    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }
    private final By logoutButtonLocator = By.xpath("//button[text()='Выход']");
    public void logoutUser(){
        WebElement logoutButton = driver.findElement(logoutButtonLocator);
        logoutButton.click();
    }
}
