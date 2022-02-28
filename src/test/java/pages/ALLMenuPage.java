package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ALLMenuPage {

    public ALLMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (css = "#nav-hamburger-menu")
    public WebElement AllButon;

    @FindBy (xpath = "//ul[@class='hmenu hmenu-visible']//li")
    public List<WebElement> menu;

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//li")
    public List<WebElement> altmenu;

}
