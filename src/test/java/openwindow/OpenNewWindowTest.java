package openwindow;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class OpenNewWindowTest extends BaseTest {

    @Test
    public void clickOpenWindow(){
        SoftAssert softassert = new SoftAssert();
        softassert.assertTrue(driver.getWindowHandles().size() == 1);

        WebElement openWindowButton = homePage.findOpenWindowButton();
        openWindowButton.click();
        //Thread.sleep(5);
        softassert.assertTrue(driver.getWindowHandles().size() == 2);
        softassert.assertAll();
    }


}
