package site.stellarburgers;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void register(){
        goTo();
        mainPage.clickEnterButton();
        loginPage.clickSignUpLink();
        registerPage.fillInRegisterForm(user.getName(), user.getEmail(), user.getPassword());
        registerPage.clickSignUpButton();
        Assert.assertTrue(loginPage.isTitleDisplayed());
    }
    @Test
    public void registerWithWrongPassword(){
        goTo();
        user.setPassword(RandomStringUtils.randomAlphabetic(1, 5));
        mainPage.clickEnterButton();
        loginPage.clickSignUpLink();
        registerPage.fillInRegisterForm(user.getName(), user.getEmail(), user.getPassword());
        registerPage.clickSignUpButton();
        Assert.assertTrue(registerPage.isWarningDisplayed());
    }
}
