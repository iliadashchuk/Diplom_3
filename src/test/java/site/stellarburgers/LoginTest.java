package site.stellarburgers;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void signInByButtonOnMainScreenTest(){
        userSteps.createUser(user);
        goTo();
        mainPage.clickEnterButton();
        loginPage.isTitleDisplayed();
        loginPage.fillInLoginForm(user.getEmail(), user.getPassword());
        loginPage.clickSignInButton();
        Assert.assertTrue(mainPage.isBurgerBuilderTitleDisplayed());
    }
    @Test
    public void signInFromSignUpScreenTest(){
        userSteps.createUser(user);
        goTo();
        mainPage.clickEnterButton();
        loginPage.clickSignUpLink();
        registerPage.clickSignInLink();
        loginPage.isTitleDisplayed();
        loginPage.fillInLoginForm(user.getEmail(), user.getPassword());
        loginPage.clickSignInButton();
        Assert.assertTrue(mainPage.isBurgerBuilderTitleDisplayed());
    }
    @Test
    public void signInFromPersonalCabinetTest(){
        userSteps.createUser(user);
        goTo();
        mainPage.clickProfileIcon();
        loginPage.isTitleDisplayed();
        loginPage.fillInLoginForm(user.getEmail(), user.getPassword());
        loginPage.clickSignInButton();
        Assert.assertTrue(mainPage.isBurgerBuilderTitleDisplayed());
    }
    @Test
    public void signInFromForgotPasswordTest(){
        userSteps.createUser(user);
        goTo();
        mainPage.clickEnterButton();
        loginPage.isTitleDisplayed();
        loginPage.clickForgotPasswordLink();
        forgotPasswordPage.clickSignInLink();
        loginPage.isTitleDisplayed();
        loginPage.fillInLoginForm(user.getEmail(), user.getPassword());
        loginPage.clickSignInButton();
        Assert.assertTrue(mainPage.isBurgerBuilderTitleDisplayed());
    }
}
