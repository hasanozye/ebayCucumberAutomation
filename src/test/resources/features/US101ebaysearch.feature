Feature: US101ebay_search

  Scenario: TC01_Ebay Search test
    Given user goes to Ebay Landing Page
    And searches for real guns
    Then sees if results contains real guns

    Given user goes to Ebay Landing Page
    And searches for sharp knives
    Then sees if results contains sharp knives

    Given user goes to Ebay Landing Page
    And searches for flashbang bombs
    Then sees if results contains flashbang bombs

