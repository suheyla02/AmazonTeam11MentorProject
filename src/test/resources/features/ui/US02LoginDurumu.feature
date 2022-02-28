Feature:US02 Kullanici valid ve invalid login durumlari

  Scenario:TC01 Kullanici valid bilgilerle giris yapabilmeli.
  Given Kullanici amazon sayfasina gider.
  Then Kullanici ust kisimdaki Hello,Sign in butonunu tiklar.
  Then Kullanici email or phone number kismina gecerli "validemail" girmeli.
  Then Kullanici continue butonunu tiklar.
  Then Kullanici password kismina gecerli "validpassword" girmeli.
  And Kullanici sign in butonunu tiklar.
  And Kullanici sayfaya giris yaptigini dogrular.

    Scenario: TC02 Kullanici invalid bilgilerle giris yapamamali
      Given Kullanici amazon sayfasina gider.
      Then Kullanici ust kisimdaki Hello,Sign in butonunu tiklar.
      Then Kullanici email or phone number kismina gecersiz "invalidemail" girmeli.
      Then Kullanici continue butonunu tiklar.
      Then Kullanici password kismina gecersiz "invalidpassword" girmeli.
      And Kullanici sign in butonunu tiklar.
      And Kullanici sayfaya giris yapamadigini dogrular.
