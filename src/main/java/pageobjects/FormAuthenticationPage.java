package pageobjects;

import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage extends WebAbstractPage {

    private static final String formAuthorizationBtn = "//a[@href='/login']";
    private static final String usernameTxt = "//input[@id='username']";
    private static final String passwordTxt = "//input[@id='password']";
    private static final String loginBtn = "//button[@type='submit']";
    private static final String logOutBtn = "//a[@href='/logout']";
    private static final String alertAfterLogin = "//div[@id='flash']";


    public FormAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void clickToFormAuthenticationBtn() {
        waitToElementVisible(formAuthorizationBtn);
        clickToElement(formAuthorizationBtn);
    }

    public void logIn(String username, String password) {
        waitToElementVisible(usernameTxt);
        sendKeyToElement(usernameTxt, username);
        waitToElementVisible(passwordTxt);
        sendKeyToElement(passwordTxt, password);
        waitToElementVisible(loginBtn);
        clickToElement(loginBtn);
    }

    public String getTextAlertAfterLogIn(){
        return getTextWithoutTheChildNode(alertAfterLogin);
    }

    public boolean isAnErrorMessageAppearedWhenLoginWithFailed(){
        return getTextAlertAfterLogIn() != null;
    }

    public boolean isLogOutButtonDisplayed(){
        return isElementDisplayed(logOutBtn);
    }
}

