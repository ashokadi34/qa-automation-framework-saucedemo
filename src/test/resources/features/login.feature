Feature: Login

Scenario: Valid login
  Given user is on login page
  When user enters credentials
  Then login should be successful