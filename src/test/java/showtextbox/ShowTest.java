package showtextbox;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShowTest extends BaseTest {
    @Test
    public void showTextBox(){
        WebElement showButton = homePage.findShowButton();
        showButton.click();

        JavascriptExecutor j = (JavascriptExecutor) driver;
        String s = (String) j.executeScript("return document.getElementById('displayed-text').getAttributeNode('style').value");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(s,"display: block;");
        softAssert.assertAll();
    }
}
