Feature: listing all resources registered

  Scenario: listing all resources
    Given user be a endpoint
    When do get
    Then status code is 200
    And display a list of resources greater than or equal to 1