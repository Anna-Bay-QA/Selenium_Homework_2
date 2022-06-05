package checkbox;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckboxTest extends BaseTest {
    @Test
    public void chooseCheckbox(){
        WebElement checkbox3 = homePage.findCheckBox();
        checkbox3.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(checkbox3.isSelected());
        softAssert.assertAll();
    }
}
