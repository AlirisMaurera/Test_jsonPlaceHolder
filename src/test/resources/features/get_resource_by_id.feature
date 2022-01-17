Feature: get a resource by id

  Scenario Outline: get resource by valid id
    Given a user be a endpoint
    When do get with a id '<id>'
    Then status code returned is <status>
    And it shows a body of the requested resource with equal id '<id>'

    Examples:
      | id | status |
      | 1  | 200    |


  Scenario Outline: get resource by invalid id
    Given a user be a endpoint
    When do get with a id '<id>'
    Then status code returned is <status>

    Examples:
      | id  | status |
      | 110 | 404    |
