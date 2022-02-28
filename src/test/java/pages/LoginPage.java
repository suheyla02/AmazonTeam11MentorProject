package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css="#nav-link-accountList")
    public WebElement sign;

    @FindBy(css = "#ap_email")
    public WebElement email;

    @FindBy(css = ".a-button-input")
    public WebElement continu;

    @FindBy(css = "#ap_password")
    public WebElement password;

    @FindBy(id="signInSubmit")
    public WebElement signpass;

    @FindBy(className = "a-alert-heading")
    public WebElement alertmessage;
}
