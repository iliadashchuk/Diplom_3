package site.stellarburgers;

import org.junit.Assert;
import org.junit.Test;

public class LogoutTest extends BaseTest{

    @Test
    public void signInByButtonOnMainScreenTest(){
        userSteps.createUser(user);
        goTo();
        mainPage.clickEnterButton();
        loginPage.isTitleDisplayed();
        loginPage.fillInLoginForm(user.getEmail(), user.getPassword());
        loginPage.clickSignInButton();
        mainPage.clickProfileIcon();
        profilePage.logoutUser();
        Assert.assertTrue(loginPage.isTitleDisplayed());
    }
}
