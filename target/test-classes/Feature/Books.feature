 @tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline:  verify Books
    Given I open the browser
    When I enter the url "<url>"
    Then I click on the Books
    And I next click on Any one Book
    Then next click on the ADDcart button