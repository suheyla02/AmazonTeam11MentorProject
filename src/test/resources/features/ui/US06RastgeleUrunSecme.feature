Feature:
  Scenario:
    Given Kullanici amazon sayfasina gider.
    Then Kullanici arama cubuguna "arananUrun" girer.
    Then Kullanici arama butonunu tiklar.
    Then Kullanici cikan urunlerden rastgele urun secer.
    Then Kullanici sectigi urunu sepete ekler.
    Then Kullanici urunlerin sepette oldugunu gorur.
    Then Kullanici sepete eklenen urunlerin fiyatlari ile septtekinin ayni oldugunu gorur.
