Feature: US04 Aranan kelime tum urulerin isimlerinde olmali

  Scenario: Aranan urun tespiti
  Given Kullanici amazon sayfasina gider.
  Then Kullanici arama cubuguna "arananUrun" girer.
  Then Kullanici arama butonunu tiklar.
  And  Kullanici listelenen tum urunlerin "iPad" icerdigini gorur.
