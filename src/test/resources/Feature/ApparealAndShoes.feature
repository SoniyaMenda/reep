  @tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline:  verify Apparel and shoes
    Given I Open the browser
    When I launch the url "<url>"
    Then I click on the Apparel and shoes
    And next click on Any one Apparel and shoes
    Then click on the ADDcart button