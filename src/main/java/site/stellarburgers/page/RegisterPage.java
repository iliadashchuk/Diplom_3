package site.stellarburgers.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By nameInputLocator = By.xpath("//label[contains(@class, 'text') and text()='Имя']/following-sibling::input");
    private final By emailInputLocator = By.xpath("//label[contains(@class, 'text') and text()='Email']/following-sibling::input");
    private final By passwordInputLocator = By.xpath("//label[contains(@class, 'text') and text()='Пароль']/following-sibling::input");
    private final By signUpButtonLocator = By.xpath("//button[text()='Зарегистрироваться']");
    private final By invalidPasswordWarningLocator = By.xpath("//p[text()='Некорректный пароль']");
    private final By linkSignInLocator = By.xpath("//a[text()='Войти']");
    public void fillInRegisterForm(String name, String email, String password){
        typeName(name);
        typeEmail(email);
        typePassword(password);
    }
    public void typeName(String name){
        WebElement nameInput = driver.findElement(nameInputLocator);
        nameInput.sendKeys(name);
    }
    public void typeEmail(String email){
        WebElement nameInput = driver.findElement(emailInputLocator);
        nameInput.sendKeys(email);
    }
    public void typePassword(String password){
        WebElement nameInput = driver.findElement(passwordInputLocator);
        nameInput.sendKeys(password);
    }
    public void clickSignUpButton(){
        WebElement signUpButton = driver.findElement(signUpButtonLocator);
        signUpButton.click();
    }
    public boolean isWarningDisplayed(){
        WebElement warningPassword = driver.findElement(invalidPasswordWarningLocator);
        return warningPassword.isDisplayed();
    }
    public void clickSignInLink(){
        WebElement signInLink = driver.findElement(linkSignInLocator);
        signInLink.click();
    }
}
