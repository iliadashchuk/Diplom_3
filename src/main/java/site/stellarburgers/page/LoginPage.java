package site.stellarburgers.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private final By emailInputLocator = By.xpath("//label[contains(@class, 'text') and text()='Email']/following-sibling::input");
    private final By passwordInputLocator = By.xpath("//label[contains(@class, 'text') and text()='Пароль']/following-sibling::input");
    private final By signInButtonLocator = By.xpath("//button[text()='Войти']");
    private final By titleLocator = By.xpath("//h2[text()='Вход']");
    private final By linkSignUpLocator = By.xpath("//a[text()='Зарегистрироваться']");
    private final By linkForgotPasswordLocator = By.xpath("//a[text()='Восстановить пароль']");
    public void fillInLoginForm(String email, String password){
        typeEmail(email);
        typePassword(password);
    }
    public void typeEmail(String email){
        WebElement nameInput = driver.findElement(emailInputLocator);
        nameInput.sendKeys(email);
    }
    public void typePassword(String password){
        WebElement nameInput = driver.findElement(passwordInputLocator);
        nameInput.sendKeys(password);
    }
    public void clickSignInButton(){
        WebElement signUpButton = driver.findElement(signInButtonLocator);
        signUpButton.click();
    }
    public boolean isTitleDisplayed(){
        WebElement title = driver.findElement(titleLocator);
        return title.isDisplayed();
    }
    public void clickSignUpLink(){
        WebElement link = driver.findElement(linkSignUpLocator);
        link.click();
    }
    public void clickForgotPasswordLink(){
        WebElement forgotLink = driver.findElement(linkForgotPasswordLocator);
        forgotLink.click();
    }
}
