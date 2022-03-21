@smoke
Feature: resetPassword | users will be able to reset password
  Scenario: user could reset password
    Given user go to login and press into forget password
    When  user add email address  and click recover
     Then user get alert of mail sent to your mail
