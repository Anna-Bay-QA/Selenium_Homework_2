package radiobutton;

import base.BaseTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    public void clickRadioButton(){
        WebElement option2 = homePage.findRadioButton();
        option2.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(option2.isSelected());
        softAssert.assertAll();

    }

}
