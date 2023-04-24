   @tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline:  verify Digital Downloads
    Given The user Open the browser
    When user launch the url "<url>"
    Then user click on the Digital Downloads
    And next click 3rd Alubm
    Then click on Addcart button