package iframe;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iFrameTest extends BaseTest {

    private final By registerButton = By.cssSelector("div .login-btn a ");

    @Test
    public void scrollIframe(){
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        WebElement iFrame = homePage.findIFrameElement();
        driver.switchTo().frame(iFrame);
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iFrame);
        driver.findElement(registerButton).click();

    }
}
