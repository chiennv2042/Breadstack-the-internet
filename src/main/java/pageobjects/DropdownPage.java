package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownPage extends WebAbstractPage {
    private static final String dropdownBtn = "//a[@href='/dropdown']";
    private static final String dropdownList = "//select[@id='dropdown']";
    private static final String optionList = "//select[@id='dropdown']/option";
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void clickToDropdownBtn() {
        waitToElementVisible(dropdownBtn);
        clickToElement(dropdownBtn);
    }
    public void clickToDropdownList() {
        waitToElementVisible(dropdownList);
        clickToElement(dropdownList);
    }

    public boolean isEachOptionCanBeSelected() {
        int count = 0;
        List<WebElement> options = getListElements(optionList);
        for(WebElement option : options){
            if(!option.getAttribute("value").equals("disabled")){
                option.click();
                count ++;
            }
        }
        return count == options.size();
    }

}
