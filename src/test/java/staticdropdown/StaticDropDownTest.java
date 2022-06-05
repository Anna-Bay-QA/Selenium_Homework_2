package staticdropdown;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StaticDropDownTest extends BaseTest {
    @Test
    public void selectFromStaticDropDown(){
        WebElement selectOptions = homePage.findStaticDropdownElement();
        selectOptions.click();
        WebElement option3 = homePage.findSelectedOptionDropdown();
        option3.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(option3.isSelected());
        softAssert.assertAll();


    }
}
