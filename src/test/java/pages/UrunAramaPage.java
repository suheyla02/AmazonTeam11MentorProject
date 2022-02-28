package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UrunAramaPage {

    public UrunAramaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="twotabsearchtextbox")
    public WebElement aramaCubugu;

    @FindBy (id = "nav-search-submit-button")
    public WebElement aramabutonu;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> baslikIsimleri;


}
