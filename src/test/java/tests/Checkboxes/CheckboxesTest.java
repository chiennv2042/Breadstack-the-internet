package tests.Checkboxes;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class CheckboxesTest extends BaseTest {
    @Test
    public void verifyThatCheckboxesCanBeCheckedAndUnchecked(){
        //Step 1. Go to Checkboxes page
        pageGenerator.checkboxesPage().clickToCheckboxesBtn();
        //Step 2. Check and uncheck each checkbox
        Assert.assertTrue(pageGenerator.checkboxesPage().areCheckboxesCanBeCheckAndUncheck());
    }
}
