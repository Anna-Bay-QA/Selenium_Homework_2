package confirm;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ConfirmTest extends BaseTest {
    @Test
    public void clickConfirm(){
        WebElement inputElm = homePage.findInputForAlertConfirm();
        inputElm.sendKeys("Anna");
        String filledText = inputElm.getAttribute("value");
        WebElement confirmButton = homePage.findConfirmButton();
        confirmButton.click();

        Alert confirm = driver.switchTo().alert();
        String confirmMessage = confirm.getText();
        System.out.println(confirmMessage);
        //Thread.sleep(5000);
        confirm.accept();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(confirmMessage.contains(filledText));
        softAssert.assertAll();
    }
}
