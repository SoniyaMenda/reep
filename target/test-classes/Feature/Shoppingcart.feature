@tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline: verify the Shoppingcart
    Given open the chrome browser
    Then click on the shoppingcart
    When select country
    Then enter the postalcode
    And click on the term of services
    When click on the checkout button


