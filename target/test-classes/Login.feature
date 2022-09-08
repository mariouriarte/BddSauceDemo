Feature: As a user i want to be able to login into Sauce Labs Demo Web Page
  Scenario: Login into Sauce Demo page with valid credentials
    Given I am in the Sauce Labs Demo Page
    When I set the user name text box with a valid user name
    And I set the password text box with a valid password
    And I click on the login button
    Then I should be in the home page