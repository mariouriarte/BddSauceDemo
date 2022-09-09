Feature: As a user i should be able to checkout a purchase

  Background: User is logged into sauce demo web page
#    Given I am in the Sauce Labs Demo Page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Sauce labs backpack checkout
    When I add sauce labs back pack product to the car
    And I click on the cart icon
    And I click on checkout button
    And I fill the customer data with
      | Mario | Uriarte | 00000 |
    And I click on continue button
    And I click on finish button
    Then I should see a message that says "THANK YOU FOR YOUR ORDER"
