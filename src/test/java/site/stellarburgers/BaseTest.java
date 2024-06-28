package site.stellarburgers;

import io.restassured.RestAssured;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import site.stellarburgers.model.User;
import site.stellarburgers.page.*;
import site.stellarburgers.steps.UserSteps;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    User user;
    UserSteps userSteps = new UserSteps();

    LoginPage loginPage;
    MainPage mainPage;
    RegisterPage registerPage;
    ForgotPasswordPage forgotPasswordPage;
    ProfilePage profilePage;
    private final String SITE_URL = "https://stellarburgers.nomoreparties.site";
    public void goTo(){
        driver.get(SITE_URL);
    }

    @Before
    public void start(){
        RestAssured.baseURI = "https://stellarburgers.nomoreparties.site";
        driver = WebDriverFactory.getWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        profilePage = new ProfilePage(driver);

        user = new User();
        user.setName(RandomStringUtils.randomAlphabetic(8, 10));
        user.setPassword( RandomStringUtils.randomAlphabetic(8, 10));
        user.setEmail( RandomStringUtils.randomAlphabetic(8, 10) + "@yandex.ru");
    }
    @After
    public void finish(){
        driver.quit();
        user.setName(null);
        String accessToken = userSteps.loginUser(user)
                .extract()
                .body()
                .path("accessToken");
        user.setAccessToken(accessToken);
        if(accessToken != null){
            user.setAccessToken(accessToken.substring(7));
            userSteps.deleteUser(user);
        }
    }
}
