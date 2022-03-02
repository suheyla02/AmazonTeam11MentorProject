package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RastgeleUrunPage {
    public RastgeleUrunPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id="add-to-cart-button")
    public WebElement addCart;

    @FindBy(xpath = "//td[@class='a-span12']")
    public WebElement urunprijs;

    @FindBy(xpath = "//span[@id='attach-sidesheet-view-cart-button']")
    public WebElement cartButton;

    @FindBy (id="sc-subtotal-amount-buybox")
    public WebElement cartPrijs;
}
