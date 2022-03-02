package stepDefinitions.ui;

import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

public class US01AmazonSayfasiStepDefinitions {

    //Logger logger= (Logger)LogManager.getLogger(US01AmazonSayfasiStepDefinitions.class);

    @Given("Kullanici amazon sayfasina gider.")
    public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        //logger.info("Anasayfa Acildi.");
        Log.info("Anasayfa acildi.");
    }


}
