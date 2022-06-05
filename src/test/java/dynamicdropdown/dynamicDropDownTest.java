package dynamicdropdown;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dynamicDropDownTest extends BaseTest {
    @Test
    public void selectFromDynamicDropDown(){
        WebElement dynamicCountryInput = homePage.findSuggestionInput();
        dynamicCountryInput.sendKeys("an");
        dynamicCountryInput.sendKeys(Keys.DOWN, Keys.RETURN);
        String textInput = dynamicCountryInput.getAttribute("value");
       // Thread.sleep(5);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(textInput, "Afghanistan", "Not Correct");
       // softAssert.assertAll();

    }

}
