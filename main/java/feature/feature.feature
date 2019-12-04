Feature: Order

  Scenario: Search for restaurants for a given postal code
    Given I am on the launch page of the application
    When I enter the zipcode and search
    Then A new page should open with restaurant details


  Scenario: Search for restaurant with name of city
    Given I am on the launch page of the application
    When I enter the name of the city and search
    Then An error message should display below the postal code box

  Scenario: Search for restaurants that sell only Pizza
    Given I am on the launch page of the application
    When I enter the zipcode and search
    And I select Pizza from the top Menu
    Then I should see '83' restaurants in the result of the search
