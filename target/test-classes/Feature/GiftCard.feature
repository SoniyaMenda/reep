  @tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline:  verify GiftCards
    Given I open the chrome
    When I open the url "<url>"
    Then I click on the GiftCards
    And I next click on Any one GiftCard
    When I enter Recipients Name
    And I enter Recipient Email
    #Then I enter your name
    #And I enter your email
    Then next click ADDcart button