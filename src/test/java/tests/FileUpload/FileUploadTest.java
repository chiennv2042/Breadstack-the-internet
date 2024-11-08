package tests.FileUpload;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class FileUploadTest extends BaseTest {
    @Test
    public void verifyThatAFileCanBeSuccessfullyUploaded(){
        String filePath = (System.getProperty("user.dir") + "/src/test/resources/testdata/a.jpg");
        String filename = "a.jpg";
        //Step 1. Go to File Upload page
        pageGenerator.fileUploadPage().clickToFileUploadBtn();
        //Step 2. Select specific file to upload
        pageGenerator.fileUploadPage().selectFileToUpload(filePath);
        //Step 3. Click on the Upload button
        pageGenerator.fileUploadPage().clickToUploadBtn();
        //Step 4. Verify the uploaded filename is correct
        Assert.assertEquals(pageGenerator.fileUploadPage().getFilenameAfterUploadedSuccessfully(), filename, "Two filename are not matched");
    }
}
