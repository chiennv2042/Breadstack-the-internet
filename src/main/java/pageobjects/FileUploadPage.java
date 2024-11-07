package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FileUploadPage extends WebAbstractPage {
    private static final String fileuploadBtn = "//a[@href='/upload']";
    private static final String chooseFileBtn = "//input[@id='file-upload']";
    private static final String uploadBtn = "//input[@id='file-submit']";
    private static final String filenameUploaded = "//div[@id='uploaded-files']";
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void clickToFileUploadBtn() {
        waitToElementVisible(fileuploadBtn);
        clickToElement(fileuploadBtn);
    }
    public void selectFileToUpload(String filename) {
        waitToElementVisible(chooseFileBtn);
        sendKeyToElement(chooseFileBtn, filename);
    }
    public void clickToUploadBtn() {
        waitToElementVisible(uploadBtn);
        clickToElement(uploadBtn);
    }
    public String getFilenameAfterUploadedSuccessfully(){
        return getTextElement(filenameUploaded);
    }


}
