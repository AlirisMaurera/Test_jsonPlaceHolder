Feature: Delete a resource existing

  Scenario: Delete a resource existing sucessfull
    Given a valid id "1"
    When do delete in the endpoint
    Then status code returned 200

