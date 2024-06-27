package site.stellarburgers;

import org.junit.Assert;
import org.junit.Test;

public class MainPageTest extends BaseTest{

    @Test
    public void clickOnBuilderIconFromProfile() {
        userSteps.createUser(user);

        goTo();
        mainPage.clickEnterButton();
        loginPage.isTitleDisplayed();
        loginPage.fillInLoginForm(user.getEmail(), user.getPassword());
        loginPage.clickSignInButton();
        mainPage.clickBurgerBuilderIcon();
        Assert.assertTrue(mainPage.isBurgerBuilderTitleDisplayed());
    }
    @Test
    public void switchBetweenBunsSaucesFillingsSections() {
        goTo();
        Assert.assertTrue(mainPage.isBunTabSelected());
        mainPage.clickSaucesTab();
        Assert.assertTrue(mainPage.isSaucesTabSelected());
        mainPage.clickFillingsTab();
        Assert.assertTrue(mainPage.isFillingsTabSelected());
        mainPage.clickBunsTab();
        Assert.assertTrue(mainPage.isBunTabSelected());
    }
}
