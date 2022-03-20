@regression

Feature: user will be able to reset password

  Background: open browser and navigate to login screen
    Given  user open the browser
    And   user navigate to login screen
  #Test Scenario 1:
  Scenario: user press into forget password link
    When  user enter "nourhanghareeb1@gmail.com"
    And user click on recover
    #Expected result
    Then get message of email sent


  #Test Scenario 2:
  Scenario: user login with invalid email and password
    When  user enter "nourhanghareeb1@qpiii.io" and "123456"
    And user click on login button
    #Expected result
    Then user could not login