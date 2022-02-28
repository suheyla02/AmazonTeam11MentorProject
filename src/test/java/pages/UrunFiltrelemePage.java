package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UrunFiltrelemePage {

    public UrunFiltrelemePage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (id="p_89/Apple")
    public WebElement filter;

    @FindBy (xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement featured;

    @FindBy(xpath = "(//li[@class='a-dropdown-item'])[2]")
    public WebElement lowToHigh;

    @FindBy (xpath = "//div[@class='a-row a-size-base a-color-base']")
    public List<WebElement> prijs;


}
