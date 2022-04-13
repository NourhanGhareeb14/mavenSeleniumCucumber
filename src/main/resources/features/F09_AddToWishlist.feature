@smoke
Feature: AddToWishlist | users will be able to  add to wishlist
  Scenario: user could add to wishlist
    When user go to product and user add it to wishlist
    And user select wishlist
    Then user get products added to wishlist
