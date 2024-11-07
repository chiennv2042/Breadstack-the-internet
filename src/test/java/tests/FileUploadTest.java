package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest{
    @Test
    public void verifyThatAFileCanBeSuccessfullyUploaded(){
        String filePath = (System.getProperty("user.dir") + "/src/test/resources/testdata/a.jpg");
        String filename = "a.jpg";
        pageGenerator.fileUploadPage().clickToFileUploadBtn();
        pageGenerator.fileUploadPage().selectFileToUpload(filePath);
        pageGenerator.fileUploadPage().clickToUploadBtn();
        Assert.assertEquals(pageGenerator.fileUploadPage().getFilenameAfterUploadedSuccessfully(), filename, "Two filename are not matched");
    }
}
