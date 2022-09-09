Feature: As a user i should be add items to cart

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Sauce labs backpack checkout
    When I add sauce labs back pack product to the car
    And I click on the cart icon
    Then I verify that the item is "Sauce Labs Backpack"
