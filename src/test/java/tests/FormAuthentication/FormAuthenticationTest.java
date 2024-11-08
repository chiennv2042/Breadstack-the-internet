package tests.FormAuthentication;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FormAuthenticationTest extends BaseTest {

    @Test
    public void verifyThatUsersCanSuccessfullyLogInWithValidCredentials() {
        //Step 1. Go to Form Authentication (Login) page
        pageGenerator.formAuthenticationPage().clickToFormAuthenticationBtn();
        //Step 2. Input valid username and password and click on the Login button
        pageGenerator.formAuthenticationPage().logIn(username, password);
        //Step 3. Verify that user successfully login if the logout button is displayed
        Assert.assertTrue(pageGenerator.formAuthenticationPage().isLogOutButtonDisplayed());
    }

    @Test
    public void verifyThatAnErrorMessageAppearsForInvalidCredentials() {
        //Step 1. Go to Form Authentication (Login) page
        pageGenerator.formAuthenticationPage().clickToFormAuthenticationBtn();
        //Step 2. Input invalid username and password and click on the Login button
        pageGenerator.formAuthenticationPage().logIn(invalidUsername, invalidPassword);
        //expected error message
        String expectedAlert = "Your username is invalid!";
        //Step 3. Verify an error message is appeared
        Assert.assertTrue(pageGenerator.formAuthenticationPage().isAnErrorMessageAppearedWhenLoginWithFailed(), "The error message is not appeared");
        //Step 4. Compare the actual error message to the expected one
        Assert.assertEquals(pageGenerator.formAuthenticationPage().getTextAlertAfterLogIn(), expectedAlert, "The alert are not match");
    }
}

