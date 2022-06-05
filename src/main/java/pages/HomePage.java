package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    private final WebDriver driver;
    private final By radioButton = By.cssSelector("input[value='radio2']");
    private final By suggestionInput = By.cssSelector("input#autocomplete");
    private final By dropDown = By.cssSelector("select#dropdown-class-example");
    private final By dropdownOption = By.cssSelector("select#dropdown-class-example  option[value='option3']");
    private final By checkBox = By.cssSelector("label #checkBoxOption3");
    private final By openWindow = By.cssSelector("fieldset #openwindow");
    private final By openTab = By.cssSelector("a#opentab[href='https://www.rahulshettyacademy.com/']");
    private final By alertInput = By.cssSelector("fieldset #name");
    private final By alertButton = By.cssSelector("fieldset #alertbtn");
    private final By confirmButton = By.cssSelector("fieldset #confirmbtn");
    private final By hideButton = By.cssSelector("fieldset #hide-textbox");
    private final By showButton = By.cssSelector("fieldset #show-textbox");
    private final By table = By.cssSelector("fieldset .tableFixHead");
    private final By mouseHover = By.cssSelector("button#mousehover");
    private final By mouseHoverTop = By.cssSelector("div.mouse-hover-content a[href=\"#top\"]");
    private final By mouseHoverReload = By.cssSelector("div.mouse-hover-content a[href=\"\"]");
    private final By iFrame = By.cssSelector("fieldset #courses-iframe");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public  WebElement findRadioButton(){
        WebElement radioButtonElement = driver.findElement(radioButton);
        return radioButtonElement;
    }

    public WebElement findSuggestionInput(){
        WebElement dynamicInputCountry = driver.findElement(suggestionInput);
        return dynamicInputCountry;
    }

    public WebElement findStaticDropdownElement(){
        WebElement staticDropDown = driver.findElement(dropDown);
        return staticDropDown;
    }

    public WebElement findSelectedOptionDropdown(){
        WebElement selectedOption = driver.findElement(dropdownOption);
        return selectedOption;
    }

    public WebElement findCheckBox(){
        WebElement checkbox =  driver.findElement(checkBox);
        return checkbox;
    }

    public WebElement findOpenWindowButton(){
        WebElement openWindowBtn = driver.findElement(openWindow);
        return openWindowBtn;
    }


    public WebElement findOpenTabButton(){
        WebElement openTabBtn = driver.findElement(openTab);
        return openTabBtn;
    }

    public  WebElement findInputForAlertConfirm(){
        WebElement InputElmAlertConfirm =  driver.findElement(alertInput);
        return InputElmAlertConfirm;
    }


    public  WebElement findAlertButton(){
        WebElement alertBtn = driver.findElement(alertButton);
        return alertBtn;
    }

    public  WebElement findConfirmButton(){
        WebElement confirmtBtn = driver.findElement(confirmButton);
        return confirmtBtn;
    }

    public  WebElement findHideButton(){
        WebElement hideBtn = driver.findElement(hideButton);
        return hideBtn;
    }


    public  WebElement findShowButton(){
        WebElement showBtn = driver.findElement(showButton);
        return showBtn;
    }

    public  WebElement findTable(){
        WebElement tableElm = driver.findElement(table);
        return tableElm;
    }


    public WebElement findMouseHoverButton(){
        WebElement mouseHoverBtn = driver.findElement(mouseHover);
        return mouseHoverBtn;
    }
/*
    public WebElement findTopButton(){
       WebElement topBtn = driver.findElement(mouseHoverTop);
       return topBtn;
    }

    public WebElement findReloadButton(){
        WebElement reloadBtn = driver.findElement(mouseHoverReload);
        return reloadBtn;
    }
*/

    public  WebElement findIFrameElement(){
        WebElement iFrameElm = driver.findElement(iFrame);
        return iFrameElm;
    }


}