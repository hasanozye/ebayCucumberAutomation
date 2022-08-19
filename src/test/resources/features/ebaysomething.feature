Feature: ebaysomething.feature

  Background: ebay sayfasına gider
    Given user goes to Ebay Landing Page


  @ebayGun
  Scenario: TC01_Ebay gun test
    And searches for real guns
    Then sees if results contains real guns

    @ebayKnife
    Scenario: TC01_Ebay knives test
      And searches for sharp knives
      Then sees if results contains sharp knives

      @ebayFlashBang
      Scenario: TC01_Ebay flashbang test
        And searches for flashbang bombs
        Then sees if results contains flashbang bombs