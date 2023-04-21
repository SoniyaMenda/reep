@tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline: verify Jewelry
    Given user should Open the browser
    When launch the url "<url>"
    Then I click on the jewelry
    And next click on  Black and white Diamond heart
    Then click on ADDcart button
