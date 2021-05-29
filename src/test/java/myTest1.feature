@RegressionTest
Feature: Sign in Test

  Scenario Outline: Sign in Testi

    Given Websiteye git

    And Sign in butonuna tıkla

    And "<Email>" girisi yap

    And Create an Account butonuna tıkla

    And Title sec

    And firstname "<Firstname>" ve  lastname "<lastname>" gir

    And password "<Password>" gir

    When Company "<Company>" gir

    Then  Adres "<Address>" gir

    Examples:

      | Email                  | Firstname | lastname | Password   | Company       | Address            |
      | omeroz@gmail.com       | Omer      | Ozdemir  | omer123    | Techno  Study | Ricarda Huch weg22 |
      | cigdemarslan@gmail.com | Cigdem    | Arslan   | cigdem123  | Apple         | Ricarda Huch weg23 |
      | vehbi@gmail.com        | vehbi     | ozdemir  | vehbi123   | Siemens       | Ricarda Huch weg24 |
      | huseyin@gmail.com      | huseyin   | ozdemir  | huseyin123 | Amazon        | Ricarda Huch weg25 |


