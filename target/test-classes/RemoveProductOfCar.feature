Feature: As a user i should be remove items to cart

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Sauce labs backpack is remove to cart
    When I add sauce labs back pack product to the car
    And I click on the remove button on sauce labs back pack
    Then I verify that the button ADD TO CART is display
