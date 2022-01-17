Feature: Patching a resource existing

  Scenario Outline: Patching a resource existing sucessfull
    Given a valid data of user existing '<title>'
    When do patch in the endpoint in a register with id '<id>'
    Then return a status code <status>
    And the data is update '<title>'

    Examples:
      | title  | status | id |
      | cheese | 200    | 1  |
