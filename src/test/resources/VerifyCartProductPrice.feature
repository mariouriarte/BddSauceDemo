Feature: Verify price product selected in cart

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Verify price of Sauce labs backpack show in checkout
    When I add sauce labs back pack product to the car
    And I click on the cart icon
    Then I should see a label price that says "$29.99"
