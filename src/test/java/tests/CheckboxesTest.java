package tests;

import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest{
    @Test
    public void verifyThatCheckboxesCanBeCheckedAndUnchecked(){
        pageGenerator.checkboxesPage().clickToCheckboxesBtn();
        pageGenerator.checkboxesPage().areCheckboxesCanBeCheckAndUncheck();
    }
}
