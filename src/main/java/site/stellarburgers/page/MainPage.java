package site.stellarburgers.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    private final By enterButtonLocator = By.xpath("//button[text()='Войти в аккаунт']");
    private final By profileAccountIconLocator = By.xpath("//p[text()='Личный Кабинет']");
    private final By builderIconLocator = By.xpath("//p[text()='Конструктор']");
    private final By builderTitleLocator = By.xpath("//h1[text()='Соберите бургер']");
    private final By bunsTabLocator = By.xpath("//span[text()='Булки']");
    private final By saucesTabLocator = By.xpath("//span[text()='Соусы']");
    private final By fillingsTabLocator = By.xpath("//span[text()='Начинки']");
    private final By bunsTabSelectedLocator = By.xpath("//div[contains(@class, 'current')]/span[text()='Булки']");
    private final By saucesTabSelectedTitleLocator = By.xpath("//div[contains(@class, 'current')]/span[text()='Соусы']");
    private final By fillingsTabSelectedTitleLocator = By.xpath("//div[contains(@class, 'current')]/span[text()='Начинки']");

    public void clickEnterButton(){
        WebElement enterButton = driver.findElement(enterButtonLocator);
        enterButton.click();
    }
    public void clickProfileIcon(){
        WebElement personalCabinetButton = driver.findElement(profileAccountIconLocator);
        personalCabinetButton.click();
    }
    public void clickBurgerBuilderIcon(){
        WebElement personalCabinetButton = driver.findElement(builderIconLocator);
        personalCabinetButton.click();
    }
    public boolean isBurgerBuilderTitleDisplayed(){
        WebElement titleBurgerBuilder = driver.findElement(builderTitleLocator);
        return titleBurgerBuilder.isDisplayed();
    }
    public void clickBunsTab(){
        WebElement bunsTab = driver.findElement(bunsTabLocator);
        bunsTab.click();
    }
    public void clickSaucesTab(){
        WebElement saucesTab = driver.findElement(saucesTabLocator);
        saucesTab.click();
    }
    public void clickFillingsTab(){
        WebElement fillingsTab = driver.findElement(fillingsTabLocator);
        fillingsTab.click();
    }
    public boolean isBunTabSelected(){
        WebElement bunTab = driver.findElement(bunsTabSelectedLocator);
        return bunTab.isDisplayed();
    }
    public boolean isSaucesTabSelected(){
        WebElement saucesTab = driver.findElement(saucesTabSelectedTitleLocator);
        return saucesTab.isDisplayed();
    }
    public boolean isFillingsTabSelected(){
        WebElement fillingsTab = driver.findElement(fillingsTabSelectedTitleLocator);
        return fillingsTab.isDisplayed();
    }

}
