@RegressionTest
Feature: Favorilere Ekleme

  Scenario: Ürünü favorilere ekleme testi

    Given Websiteye git

    And Tisorte tikla

    And list görünümüne tikla

    When Favorilere ekle butonuna bas

    Then cikan mesaji verify et "You must be logged in to manage your wishlist."