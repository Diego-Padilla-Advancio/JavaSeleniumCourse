Feature: Advanced Tests
  Scenario: Validate something doesn't exist
    Given I go to "https://www.saucedemo.com/"
    And I fill username "standard_user"
    And I fill password "secret_sauce"
    And I click login button
    And Click backpack ADD TO CART button
    And I click shopping cart button
    And Just wait 3000
    And Click and remove first inventory in cart
    And Just wait 3000
    And Validate that my cart is empty



  Scenario: Parametrization of WebElements
    Given I go to "https://www.saucedemo.com/"
    And I fill username "standard_user"
    And I fill password "secret_sauce"
  # And  I click login button
    And I get the description of the element with header "Sauce Labs Backpack"
    And I get the description of the element with header "Sauce Labs Bike Light"
    And I get the description of the element with header "Sauce Labs Bolt T-Shirt"
    And I get the description of the element with header "Sauce Labs Fleece Jacket"
    And I get the description of the element with header "Sauce Labs Onesie"
    And I get the description of the element with header "Test.allTheThings() T-Shirt (Red)"
    #comment
  #comment