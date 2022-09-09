Feature: Verify buttons of social networks

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Verify buttons of social networks
    Given I click on facebook button i should see "https://www.facebook.com/saucelabs" page
    And I click on twitter button i should see "https://twitter.com/saucelabs" page
    Then I click on linkedin button i should see "https://www.linkedin.com/company/sauce-labs/" page
