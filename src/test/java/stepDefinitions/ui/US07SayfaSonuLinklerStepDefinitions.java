package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SayfaSonuLinklerPage;
import utilities.Driver;
import utilities.JSUtil;

public class US07SayfaSonuLinklerStepDefinitions {
    SayfaSonuLinklerPage sayfaSonuLinklerPage=new SayfaSonuLinklerPage();

    @Then("Kullanici sayfaninalt kismindaki linklerin oldugu yere scroldown yapar.")
    public void kullanici_sayfaninalt_kismindaki_linklerin_oldugu_yere_scroldown_yapar() {
        JSUtil.scrollDownByJS();


    }
    @Then("Kullanici sayfaninalt kismindaki Amazon Business butonunu tiklar.")
    public void kullaniciSayfaninaltKismindakSellOnAmazonBusinessButonunuTiklar() {
        sayfaSonuLinklerPage.downPageLink.click();
    }


    @Then("Kullanici sayfanin dogru oldugunu gorur.")
    public void kullanici_sayfanin_dogru_oldugunu_gorur() {

        String expectedTitle="Wholesale Office Supplies & B2B Solutions | Amazon Business";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }



}
