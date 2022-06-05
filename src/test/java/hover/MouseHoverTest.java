package hover;
import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverTest extends BaseTest {
    @Test
    public void hoverButton(){
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        WebElement mouseHoverButton = homePage.findMouseHoverButton();

        Actions action = new Actions(driver);
        action.moveToElement(mouseHoverButton).perform();

    }
}
