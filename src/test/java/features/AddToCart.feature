Feature: This feature is to add a product in cart and validate the product name

  Background: 
    Given I have launched the application
    And I have Clicked on Loginbutton

  Scenario: Login with the valid credentialds and validate the product selected
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on Home Page
    When I find a product
    And I Click on the Add To Cart button in the product
    And I Click the shopping cart button
    Then I should verify the product name
