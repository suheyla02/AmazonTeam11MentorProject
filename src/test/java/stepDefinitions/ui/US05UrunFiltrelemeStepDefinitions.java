package stepDefinitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.UrunFiltrelemePage;

import java.util.ArrayList;
import java.util.List;

public class US05UrunFiltrelemeStepDefinitions {

    UrunFiltrelemePage urunFiltrelemePage=new UrunFiltrelemePage();

    @Given("Kullanici acilan menude sol kosedeki butonlardan {string} secenegini secer.")
    public void kullaniciAcilanMenudeSolKosedekiButonlardanSeceneginiSecer(String string) {
        urunFiltrelemePage.filter.click();
    }

    @Then("Kullanici sag kosedeki featured  butonunu tiklar.")
    public void kullanici_sag_kosedeki_featured_butonunu_tiklar() {
        urunFiltrelemePage.featured.click();

    }
    @Then("Kullanici low to high butonunu tiklar.")
    public void kullanici_low_to_high_butonunu_tiklar() {
        urunFiltrelemePage.lowToHigh.click();

    }


    @Then("Kullanici tum urunlerin az fiyattan cok fiyata dogru siralandigini gorur.")
    public void kullaniciTumUrunlerinAzFiyattanCokFiyataDogruSiralandiginiGorur() {
        List<String> gelenPrijs=new ArrayList<>();
        for(int i=0;i<urunFiltrelemePage.prijs.size();i++){
            gelenPrijs.add(urunFiltrelemePage.prijs.get(i).getText());
        }
        System.out.println(gelenPrijs);






    }
}
