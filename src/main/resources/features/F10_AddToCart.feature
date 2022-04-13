@smoke
Feature: AddToCart| users will be able to  add to Cart
  Scenario: user could add to Cart
    When user go to product and  add it to Cart
    And user select cart
    Then user get products added to Cart
