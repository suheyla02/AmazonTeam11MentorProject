package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ALLMenuPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US03ALLMenusuStepDefinitions {

    ALLMenuPage allMenuPage=new ALLMenuPage();

    @Then("Kullanici ALL menusunu secer.")
    public void kullanici_all_menusunu_secer() {
        allMenuPage.AllButon.click();

    }

    @Then("Kullanici {string} menusunu secer.")
    public void kullanici_menusunu_secer(String baslik) {
        for(int i=0;i<allMenuPage.menu.size();i++){
            if(allMenuPage.menu.get(i).getText().equals(baslik)){
                allMenuPage.menu.get(i).click();

            } }
    }

    @Then("Computers altinda {int} adet kategorinin listelendigini gorur.")
    public void computers_altinda_adet_kategorinin_listelendigini_gorur(int baslikSayisi) {

        Assert.assertEquals(allMenuPage.altmenu.size()-3, baslikSayisi);

        List<String> altbasliklar=new ArrayList<>();
        altbasliklar.addAll(Arrays.asList("Computer Accessories & Peripherals, Computer Components, " +
                "Computers & Tablets, Data Storage, External Components, " +
                "Laptop Accessories, Monitors, Networking Products," +
                "Power Strips & Surge Protectors, Printers, Scanners, " +
                "Servers, Tablet Accessories, Tablet Replacement Parts, Warranties & Services"));
        System.out.println(altbasliklar);

        List<String> gelenaltbasliklar=new ArrayList<>();
        for (int i=0;i<allMenuPage.altmenu.size();i++){
            gelenaltbasliklar.add(allMenuPage.altmenu.get(i).getText());
        }

        Assert.assertTrue(gelenaltbasliklar.containsAll(altbasliklar));


    }


}
