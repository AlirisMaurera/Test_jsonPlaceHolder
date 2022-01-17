Feature: Updating a resource existing

  Scenario Outline: updating a resource existing sucessfull
    Given a valid data of user existing '<title>' '<body>' <userId>
    When do put in the endpoint in a register with id '<id>'
    Then return status code <status>
    And the data is update '<title>' '<body>' '<userId>'

    Examples:
      | title | body | userId | status |id|
      | foot  | bart | 2      | 200    |1 |