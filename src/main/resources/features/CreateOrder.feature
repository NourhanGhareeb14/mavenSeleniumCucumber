@smoke
Feature: Createorder| users will be able to craete order
  Scenario: user could create order
    Given user login
    When  user login  "valid" "n.ghareeb@qpix.io" and "12345678"
    And user select product and  add it to Cart
    #And user select cart and check terms
    Then user press on checkout and complete order
