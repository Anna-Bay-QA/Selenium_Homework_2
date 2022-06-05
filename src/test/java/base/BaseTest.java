package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @BeforeMethod
    public void goHomepage(){
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
