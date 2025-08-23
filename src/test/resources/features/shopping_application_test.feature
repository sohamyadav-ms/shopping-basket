Feature: Validating cost calculation for items in shopping basket

  As an application owner
  I want to verify the total cost being calculated for all the items added to the basket

  Scenario: Empty basket should cost 0
    Given An empty basket
    When I calculate the total price
    Then the total price should match expected

  Scenario: Null basket should cost 0
    Given A null basket
    When I calculate the total price_a
    Then a_the total price should match expected

  Scenario: Single Apple added in the basket
    Given Following items are added to the basket_b
    When I calculate the total price_b
    Then b_The total price should match expected

  Scenario: Single Banana added in the basket
    Given Following items are added to the basket_c
    When I calculate the total price_c
    Then c_The total price should match expected

  Scenario: Single Melon added in the basket
    Given Following items are added to the basket_d
    When I calculate the total price_d
    Then d_the total price should match expected

  Scenario: Single Lime added in the basket
    Given Following items are added to the basket_e
    When I calculate the total price_e
    Then e_the total price should match expected

  Scenario: Multiple Apples and Bananas added in the basket
    Given Following items are added to the basket_f
    When I calculate the total price_f
    Then f_the total price should match expected

  Scenario: Case insensitive item names
    Given Following items are added to the basket_g
    When I calculate the total price_g
    Then g_the total price should match expected

  Scenario Outline: Melon offer - buy one get one free
    Given Following items are added to the basket_h
    When I calculate the total price_h
    Then h_the total price should match expected

  Scenario Outline: Lime offer - three for the price of two
    Given Following items are added to the basket_i
    When I calculate the total price_i
    Then i_the total price should match expected

   Scenario: Mixed basket with offers
    Given Following items are added to the basket_j
    When I calculate the total price_j
    Then j_the total price should match expected

  Scenario: Basket with unknown items, items should get ignored
    Given Following items are added to the basket_k
    When I calculate the total price_k
    Then k_the total price should match expected

  Scenario: Basket with whitespace items
    Given Following items are added to the basket_l
    When I calculate the total price_l
    Then l_the total price should match expected

  Scenario: Basket with special character items
    Given Following items are added to the basket_m
    When I calculate the total price_m
    Then m_the total price should match expected

  Scenario: Basket with only unknown items
    Given Following items are added to the basket_n from test data
    When I calculate the total price_n
    Then n_the total price should match expected
