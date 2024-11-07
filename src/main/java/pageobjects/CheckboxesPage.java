package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends WebAbstractPage {
    private static final String checkboxesBtn = "//a[@href='/checkboxes']";
    private static final String checkboxesList = "//input[@type='checkbox']";
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void clickToCheckboxesBtn() {
        waitToElementVisible(checkboxesBtn);
        clickToElement(checkboxesBtn);
    }

    public boolean areCheckboxesCanBeChecked(){
        List<WebElement> checkboxes = getListElements(checkboxesList);
        for(WebElement checkbox : checkboxes){
            if(!checkbox.isSelected()){
                checkbox.click();
            }
            if (!checkbox.isSelected()) {
                System.out.println("Checkbox cannot be checked.");
                return false;
            }
        }
        System.out.println("All the checkboxes are checked");
        return true;
    }

    public boolean areCheckboxesCanBeUnchecked(){
        List<WebElement> checkboxes = getListElements(checkboxesList);
        for(WebElement checkbox : checkboxes){
            if(checkbox.isSelected()){
                checkbox.click();
            }
            if (checkbox.isSelected()) {
                System.out.println("Checkbox cannot be unchecked.");
                return false;
            }
        }
        System.out.println("All the checkboxes are unchecked");
        return true;
    }

    public boolean areCheckboxesCanBeCheckAndUncheck(){
        return areCheckboxesCanBeChecked() && areCheckboxesCanBeUnchecked();
    }

}
