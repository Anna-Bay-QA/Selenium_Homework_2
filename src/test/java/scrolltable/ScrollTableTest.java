package scrolltable;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollTableTest extends BaseTest {
    @Test
    public void scrollTable(){
        WebElement webTable = homePage.findTable();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webTable);
    }

}
