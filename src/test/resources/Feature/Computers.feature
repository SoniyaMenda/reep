@tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario Outline: verify Computers
    Given user open the browser and enter url"<url>"
  
    Then user Mousehover on the computers
    When user click on the Desktops
    And user click on Any one Desktop
    Then next user click  ADDcart button

  #Scenario: verify the Notebook in Computers
    #Then user click on the Notebook
    #When user click any one Notebook
    #Then user click to the ADD cart button
#
  #Scenario: verify the Accessories in Computers
    #Then user click on the Accessories
    #When user click any one Accessories
    #Then user click on ADDcart button
    #And next user click on the Shoppingcart
