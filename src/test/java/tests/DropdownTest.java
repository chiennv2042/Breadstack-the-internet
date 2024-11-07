package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest{
    @Test
    public void verifyThatEachOptionInADropdownCanBeSelected() {
        pageGenerator.dropdownPage().clickToDropdownBtn();
        pageGenerator.dropdownPage().clickToDropdownList();
        Assert.assertTrue(pageGenerator.dropdownPage().isEachOptionCanBeSelected());
    }
}
