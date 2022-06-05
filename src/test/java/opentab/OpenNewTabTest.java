package opentab;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OpenNewTabTest extends BaseTest {
    @Test
    public void clickOpenNewTab(){
        SoftAssert softassert = new SoftAssert();
        softassert.assertTrue(driver.getWindowHandles().size() == 1);

        WebElement openNewTabButton = homePage.findOpenTabButton();
        openNewTabButton.click();
        //Thread.sleep(5);
        softassert.assertTrue(driver.getWindowHandles().size() == 2);
        softassert.assertAll();
    }
}
