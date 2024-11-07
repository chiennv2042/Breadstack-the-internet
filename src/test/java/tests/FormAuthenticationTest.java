package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthenticationTest extends BaseTest {

    @Test
    public void verifyThatUsersCanSuccessfullyLogInWithValidCredentials() {
        pageGenerator.formAuthenticationPage().clickToFormAuthenticationBtn();
        pageGenerator.formAuthenticationPage().logIn(username, password);
        Assert.assertTrue(pageGenerator.formAuthenticationPage().isLogOutButtonDisplayed());
    }

    @Test
    public void verifyThatAnErrorMessageAppearsForInvalidCredentials() {
        pageGenerator.formAuthenticationPage().clickToFormAuthenticationBtn();
        pageGenerator.formAuthenticationPage().logIn(invalidUsername, invalidPassword);
        String expectedAlert = "Your username is invalid!";
        Assert.assertTrue(pageGenerator.formAuthenticationPage().isAnErrorMessageAppearedWhenLoginWithFailed(), "The error message is not appeared");
        Assert.assertEquals(pageGenerator.formAuthenticationPage().getTextAlertAfterLogIn(), expectedAlert, "The alert are not match");
    }
}

