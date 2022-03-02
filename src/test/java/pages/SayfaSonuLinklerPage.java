package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SayfaSonuLinklerPage {

    public SayfaSonuLinklerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath ="//*[text()='Amazon Business']")
    public WebElement downPageLink;
}
