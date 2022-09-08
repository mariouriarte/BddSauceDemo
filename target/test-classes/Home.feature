Feature: As a user i should be able to see all the available items in the home page

Background: User is logged into sauce demo web page
  Given I am in the Sauce Labs Demo Page
  When I set the user name text box with "standard_user"
  And I set the password text box with "secret_sauce"
  And I click on the login button

  Scenario: Sauce Labs Backpack is available in the home page
    When I am in the home page
    Then I verify that "Sauce Labs Backpack" is displayed

  Scenario: Sauce Labs Backpack is available in the home page
    When I am in the home page
    Then I verify that "Sauce Labs Bike Light" is displayed