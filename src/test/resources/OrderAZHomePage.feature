Feature: As a user the home page must show the order of the products

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Home page sort order of products
    When I click on sort items NAME Z to A
    Then I verify first products is "Test.allTheThings() T-Shirt (Red)" and last is "Sauce Labs Backpack"
