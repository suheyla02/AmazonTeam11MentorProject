package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

public class US02LoginDurumuStepDefinitions {
    LoginPage loginPage=new LoginPage();

    //TC01
    @Then("Kullanici ust kisimdaki Hello,Sign in butonunu tiklar.")
    public void kullanici_ust_kisimdaki_hello_sign_in_butonunu_tiklar() {
        loginPage.sign.click();
        Log.startTestCase("giris butonu tiklandi.");


    }

    @Then("Kullanici email or phone number kismina gecerli {string} girmeli.")
    public void kullanici_email_or_phone_number_kismina_gecerli_girmeli(String string) {
        loginPage.email.sendKeys(ConfigReader.getProperty(string));
        Log.info("gecerli email girildi.");

    }

    @Then("Kullanici continue butonunu tiklar.")
    public void kullanici_continue_butonunu_tiklar() {
        loginPage.continu.click();
        Log.info("continue butonu tiklandi.");

    }

    @Then("Kullanici password kismina gecerli {string} girmeli.")
    public void kullanici_password_kismina_gecerli_girmeli(String string) {
        loginPage.password.sendKeys(ConfigReader.getProperty(string));
        Log.info("gecerli password girildi.");

    }

    @And("Kullanici sign in butonunu tiklar.")
    public void kullanici_sign_in_butonunu_tiklar() {
        loginPage.signpass.click();
        Log.info("sign in butonu tiklandi.");

    }
    @And("Kullanici sayfaya giris yaptigini dogrular.")
    public void kullaniciSayfayaGirisYaptiginiDogrular() {
      Assert.assertEquals(ConfigReader.getProperty("basariligirisurl"),Driver.getDriver().getCurrentUrl());
      Log.endTestCase("kullanici sayfaya girdigini dogruladi.");
    }

    //TC02

    @Then("Kullanici email or phone number kismina gecersiz {string} girmeli.")
    public void kullaniciEmailOrPhoneNumberKisminaGecersizGirmeli(String string) {
        loginPage.email.sendKeys(ConfigReader.getProperty(string));
        Log.startTestCase("gecersiz mail girildi.");
    }

    @Then("Kullanici password kismina gecersiz {string} girmeli.")
    public void kullaniciPasswordKisminaGecersizGirmeli(String string) {
        loginPage.password.sendKeys(ConfigReader.getProperty(string));
        Log.info("gecersiz password girildi.");
    }


    @And("Kullanici sayfaya giris yapamadigini dogrular.")
    public void kullaniciSayfayaGirisYapamadiginiDogrular() {

        Assert.assertEquals(ConfigReader.getProperty("basarisizgirismesaj"),
                loginPage.alertmessage.getText());
        System.out.println(loginPage.alertmessage.getText());
        Log.endTestCase("Sayfaya giris yapilamadigini dogruladi.");

    }
}
