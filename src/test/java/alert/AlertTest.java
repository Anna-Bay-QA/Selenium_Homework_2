package alert;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertTest extends BaseTest {
    @Test
    public void clickAlert(){
        WebElement inputElm = homePage.findInputForAlertConfirm();
        inputElm.sendKeys("Anna");
        String filledText = inputElm.getAttribute("value");
        WebElement alertButton = homePage.findAlertButton();
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        //Thread.sleep(5000);
        alert.accept();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(alertMessage.contains(filledText));
        softAssert.assertAll();
    }
}
