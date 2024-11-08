package tests.Dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DropdownTest extends BaseTest {
    @Test
    public void verifyThatEachOptionInADropdownCanBeSelected() {
        //Step 1. Go to Dropdown page
        pageGenerator.dropdownPage().clickToDropdownBtn();
        //Step 2. Click on the Dropdown list
        pageGenerator.dropdownPage().clickToDropdownList();
        //Step 3. Verify each option can be selected by clicking on each option
        Assert.assertTrue(pageGenerator.dropdownPage().isEachOptionCanBeSelected());
    }
}
