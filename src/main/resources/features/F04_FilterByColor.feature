@smoke
Feature: Filterbycolor | users will be able to  filter by color
  Scenario: user could  filter by color
    When user go to category then select subcategory
    And user select color
    Then user get products with the selecetd color
