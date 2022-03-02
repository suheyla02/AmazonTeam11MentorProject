package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RastgeleUrunPage;
import pages.UrunAramaPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class US06RastgeleUrunSecmeStepDefinitions {
    UrunAramaPage urunAramaPage=new UrunAramaPage();
    RastgeleUrunPage rastgeleUrunPage=new RastgeleUrunPage();
    String urunprijs;
    String cartprijs;

    @Then("Kullanici cikan urunlerden rastgele urun secer.")
    public void kullanici_cikan_urunlerden_rastgele_urun_secer() {
        int gelenurunlerint;

        gelenurunlerint=urunAramaPage.baslikIsimleri.size();
        Random random=new Random();
        int intrandom=random.nextInt(gelenurunlerint);

        urunAramaPage.baslikIsimleri.get(intrandom).click();


    }
    @Then("Kullanici sectigi urunu sepete ekler.")
    public void kullanici_sectigi_urunu_sepete_ekler() {
        rastgeleUrunPage.addCart.click();
        String urunprijs=rastgeleUrunPage.urunprijs.getText();
        Driver.wait(5);


    }


    @Then("Kullanici sepete eklenen urunlerin fiyatlari ile septtekinin ayni oldugunu gorur.")
    public void kullanici_sepete_eklenen_urunlerin_fiyatlari_ile_septtekinin_ayni_oldugunu_gorur() {


        rastgeleUrunPage.cartButton.click();
        String cartprijs=rastgeleUrunPage.cartPrijs.getText();
        Driver.wait(5);

        Assert.assertEquals(urunprijs,cartprijs);

    }


}
