
Feature: Validating cost calculation for items in shopping basket

  As an application owner
  I want to verify the total cost calculated of all the items added to the basket

  Scenario: Calculate the total cost of all the items randomly added to the basket
    Given Following items are added to the basket
      | item  |
      | Apple |
      | Apple |
      | Banana|
      | Melon |
      | Melon |
      | Lime  |
      | Lime  |
      | Lime  |
    When I calculate the total price of all the items added to the basket
    Then the total price should be 170
