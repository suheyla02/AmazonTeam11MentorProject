Feature:US05 Kullanıcı ürün listeleme işleminde filtrelemeleri ve siralamalari kullanir.

  Background:
    Given Kullanici amazon sayfasina gider.
    Then Kullanici arama cubuguna "arananUrun" girer.
    Then Kullanici arama butonunu tiklar.

    Scenario:
    Given Kullanici acilan menude sol kosedeki butonlardan "apple" secenegini secer.
    Then Kullanici sag kosedeki featured  butonunu tiklar.
    Then Kullanici low to high butonunu tiklar.

    Then Kullanici tum urunlerin az fiyattan cok fiyata dogru siralandigini gorur.

