package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.UrunAramaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;


import java.util.ArrayList;
import java.util.List;


public class US04UrunAramaStepDefinitions {
    UrunAramaPage urunAramaPage=new UrunAramaPage();

    @Then("Kullanici arama cubuguna {string} girer.")
    public void kullanici_arama_cubuguna_girer(String string) {
        urunAramaPage.aramaCubugu.sendKeys(ConfigReader.getProperty(string));
       Log.startTestCase("arama cubuguna ipad girildi.");



    }
    @Then("Kullanici arama butonunu tiklar.")
    public void kullanici_arama_butonunu_tiklar() {
        urunAramaPage.aramabutonu.click();

        Driver.wait(5);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
        Log.info("arama butonu tiklandi.");

    }
    @Then("Kullanici listelenen tum urunlerin {string} icerdigini gorur.")
    public void kullanici_listelenen_tum_urunlerin_icerdigini_gorur (String string) {



        List<String> gelenUrunIsimleri=new ArrayList<>();
        for (int i=0;i<urunAramaPage.baslikIsimleri.size();i++){
            gelenUrunIsimleri.add(urunAramaPage.baslikIsimleri.get(i).getText());

        }

        System.out.println(gelenUrunIsimleri);
        System.out.println(gelenUrunIsimleri.size());

        Assert.assertFalse(gelenUrunIsimleri.contains(string));


    }

}
