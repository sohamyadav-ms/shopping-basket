Feature: Validating cost calculation for items in shopping basket

  As an application owner
  I want to verify the total cost being calculated for all the items added to the basket
  
  
  Scenario: Empty basket should cost 0
    Given An empty basket
    When I calculate the total price
    Then the total price should be 0

  Scenario: Null basket should cost 0
    Given A null basket
    When I calculate the total price_a
    Then a_the total price should be 0

  Scenario: Single Apple added in the basket
    Given Following items are added to the basket_b
      | Apple |
    When I calculate the total price_b
    Then b_the total price should be 35

  Scenario: Single Banana added in the basket
    Given Following items are added to the basket_c
      | Banana |
    When I calculate the total price_c
    Then c_the total price should be 20

  Scenario: Single Melon added in the basket
    Given Following items are added to the basket_d
      | Melon |
    When I calculate the total price_d
    Then d_the total price should be 50

  Scenario: Single Lime added in the basket
    Given Following items are added to the basket_e
      | Lime |
    When I calculate the total price_e
    Then e_the total price should be 15

  Scenario: Multiple Apples and Bananas added in the basket
    Given Following items are added to the basket_f
      | Apple  |
      | Banana |
      | Apple  |
    When I calculate the total price_f
    Then f_the total price should be 90

  Scenario: Case insensitive item names
    Given Following items are added to the basket_g
      | apple  |
      | APPLE  |
      | MeLoN  |
    When I calculate the total price_g
    Then g_the total price should be 120

  Scenario Outline: Melon offer - buy one get one free
    Given Following items are added to the basket_h
      | <items> |
    When I calculate the total price_h
    Then h_the total price should be <expected>

    Examples:
      | items                       | expected |
      | Melon, Melon                | 50       |
      | Melon, Melon, Melon, Melon  | 100      |
      | Melon, Melon, Melon, Melon, Melon | 150 |

  Scenario Outline: Lime offer - three for the price of two
    Given Following items are added to the basket_i
      | <items> |
    When I calculate the total price_i
    Then i_the total price should be <expected>

    Examples:
      | items                                           | expected |
      | Lime, Lime, Lime                                | 30       |
      | Lime, Lime, Lime, Lime                          | 45       |
      | Lime, Lime, Lime, Lime, Lime, Lime              | 60       |
      | Lime, Lime, Lime, Lime, Lime, Lime, Lime        | 75       |

  Scenario: Mixed basket with offers
    Given Following items are added to the basket_j
      | Apple |
      | Apple |
      | Banana|
      | Melon |
      | Melon |
      | Lime  |
      | Lime  |
      | Lime  |
    When I calculate the total price_j
    Then j_the total price should be 170

  Scenario: Basket with unknown items, items should get ignored
    Given Following items are added to the basket_k
      | Apple     |
      | Banana    |
      | Chocolate |
      | Melon     |
    When I calculate the total price_k
    Then k_the total price should be 105

  Scenario: Basket with whitespace items
    Given Following items are added to the basket_l
      |  Apple  |
      | Banana  |
      |   Melon |
    When I calculate the total price_l
    Then l_the total price should be 105

  Scenario: Basket with special character items
    Given Following items are added to the basket_m
      | Apple@  |
      | #Banana |
      | Melon$  |
    When I calculate the total price_m
    Then m_the total price should be 0

  Scenario: Basket with only unknown items
    Given Following items are added to the basket_n
      | Candy     |
      | Chocolate |
      | Cake      |
    When I calculate the total price_n
    Then n_the total price should be 0
