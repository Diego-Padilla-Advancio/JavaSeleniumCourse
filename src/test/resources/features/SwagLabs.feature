  Feature: SwagLabs Login tests
  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "example"
    Then Just wait 5000
    #Complete this exercise



  Scenario: Login with locked_out_user and verify locked out message
    Then I fill username "otherExample"
    #Complete this exercise


    Scenario: Testing all different login options
