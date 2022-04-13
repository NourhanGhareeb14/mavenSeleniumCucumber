@smoke
Feature: F02_Search | users will be able to search for products with different parameters

  Scenario: user could search for product using fullname
    When user clicks on search field
    And user search with name of product
    Then user could find relative results
