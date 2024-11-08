package tests;

import common.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pageobjects.PageGenerator;

import java.util.HashMap;

public class BaseTest {
    protected WebDriver driver;
    protected PageGenerator pageGenerator;
    protected static HashMap<String, HashMap<String, String>> credentials;
    protected static HashMap<String, String> urls;
    protected static String username;
    protected static String password;
    protected static String invalidUsername;
    protected static String invalidPassword;
    protected static String BASE_URL;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        pageGenerator = new PageGenerator(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @BeforeSuite
    public void beforeSuiteMethod(){
        TestConfig.initEnvironment();
        credentials = TestConfig.credentials;
        urls = TestConfig.urls;
        BASE_URL = urls.get("base_url");
        username = credentials.get("valid_credentials").get("username");
        password = credentials.get("valid_credentials").get("password");
        invalidUsername = credentials.get("invalid_credentials").get("username");
        invalidPassword = credentials.get("invalid_credentials").get("password");
    }
}
